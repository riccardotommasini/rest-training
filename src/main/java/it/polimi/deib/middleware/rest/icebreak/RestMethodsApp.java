package it.polimi.deib.middleware.rest.icebreak;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Request;

import static spark.Spark.*;

public class RestMethodsApp {

    static Logger logger = LoggerFactory.getLogger(RestMethodsApp.class);

    public static void main(String[] args) {

        port(9999);

        get("/hello", (request, response) -> analyse(request));
        head("/hello", (request, response) -> analyse(request));
        post("/hello", (request, response) -> analyse(request));
        put("/hello", (request, response) -> analyse(request));
        options("/hello", (request, response) -> analyse(request));
        delete("/hello", (request, response) -> analyse(request));


    }

    private static Object analyse(Request request) {
        logger.info(request.requestMethod());

        request.headers().forEach(logger::info);

        logger.info(request.contentType());
        logger.info(request.body());

        return request.requestMethod();
    }

}
