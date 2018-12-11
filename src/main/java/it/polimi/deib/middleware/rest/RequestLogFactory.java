package it.polimi.deib.middleware.rest;

import org.eclipse.jetty.server.AbstractNCSARequestLog;
import org.slf4j.Logger;

import java.io.IOException;

public class RequestLogFactory {

    private Logger logger;

    public RequestLogFactory(Logger logger) {
        this.logger = logger;
    }

    AbstractNCSARequestLog create() {
        return new AbstractNCSARequestLog() {
            @Override
            protected boolean isEnabled() {
                return true;
            }

            @Override
            public void write(String s) throws IOException {
                logger.info(s);
            }
        };
    }
}