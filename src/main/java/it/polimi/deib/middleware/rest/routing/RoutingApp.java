package it.polimi.deib.middleware.rest.routing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static spark.Spark.*;

public class RoutingApp {

    static Logger logger = LoggerFactory.getLogger(RoutingApp.class);

    public static void main(String[] args) {


        // matches "GET /hello/foo" and "GET /hello/bar"
        // request.params(":name") is 'foo' or 'bar'
        get("/hello/:name", (request, response) -> "Hello: " + request.params(":name"));

        // matches "GET /say/hello/to/world"
        // request.splat()[0] is 'hello' and request.splat()[1] 'world'
        get("/say/*/to/*", (request, response) -> {
            Arrays.stream(request.splat()).forEach(logger::info);
            return "Number of splat parameters: " + request.splat().length;
        });

    }
}
