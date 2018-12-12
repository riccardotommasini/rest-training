package it.polimi.deib.middleware.rest.routing;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

import static spark.Spark.*;

public class UsersApp {

    static Logger logger = LoggerFactory.getLogger(UsersApp.class);

    public static void main(String[] args) {


        path("/api", () -> {
            before("/*", (q, a) -> logger.info("Received api call"));
            path("/users", () -> {
                get("", (request, response) -> UserAPI.users());
                get("/:id", (request, response) -> UserAPI.user(request.params(":id")));
                post("/", (request, response) -> UserAPI.add());
                put("/:id", (request, response) -> {
                    String id = request.params(":id");
                    if (UserAPI.user(id) == null) {
                        response.status(201);
                        response.body(UserAPI.add(id));
                        return response.body();
                    } else {
                        response.status(409);//conflict
                        return response.body();
                    }
                });
                delete("/:id", (request, response) -> UserAPI.remove(request.params(":id")));

            });
        });
    }
}
