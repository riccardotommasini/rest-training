package it.polimi.deib.middleware.rest.logging;

import it.polimi.deib.middleware.rest.icebreak.RestMethodsApp;
import org.eclipse.jetty.server.AbstractNCSARequestLog;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.thread.QueuedThreadPool;
import org.eclipse.jetty.util.thread.ThreadPool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.embeddedserver.EmbeddedServers;
import spark.embeddedserver.jetty.EmbeddedJettyFactory;
import spark.embeddedserver.jetty.JettyServerFactory;

import static spark.Spark.get;
import static spark.Spark.port;

public class LogRequestApp {

    public static void main(String[] args) {


        port(8080);
        Logger logger = LoggerFactory.getLogger(RestMethodsApp.class);


        AbstractNCSARequestLog requestLog = new RequestLogFactory(logger).create();

        EmbeddedServers.add(EmbeddedServers.Identifiers.JETTY, new EmbeddedJettyFactory(new JettyServerFactory() {
            @Override
            public Server create(int maxThreads, int minThreads, int threadTimeoutMillis) {
                Server server;
                if (maxThreads > 0) {
                    int max = maxThreads > 0 ? maxThreads : 200;
                    int min = minThreads > 0 ? minThreads : 8;
                    int idleTimeout = threadTimeoutMillis > 0 ? threadTimeoutMillis : '\uea60';
                    server = new Server(new QueuedThreadPool(max, min, idleTimeout));
                } else {
                    server = new Server();
                }

                server.setRequestLog(requestLog);

                return server;
            }

            @Override
            public Server create(ThreadPool threadPool) {
                Server server = new Server(threadPool);
                server.setRequestLog(requestLog);
                return server;
            }
        }));


        get("/logme", (request, response) -> "logme!");

    }
}
