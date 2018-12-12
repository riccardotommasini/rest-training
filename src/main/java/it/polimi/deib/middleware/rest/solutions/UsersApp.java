package it.polimi.deib.middleware.rest.solutions;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static spark.Spark.*;

public class UsersApp {

    static Logger logger = LoggerFactory.getLogger(UsersApp.class);

    public static void main(String[] args) {
        Gson gson = new Gson();

        path("/api", () -> {
            before("/*", (q, a) -> logger.info("Received api call"));
            path("/users", () -> {
                get("", (request, response) -> UserAPI.users());
                get("/:id", (request, response) -> UserAPI.user(request.params(":id")));
                post("", (request, response) -> {
                    response.type("application/json");
                    response.status(201);
                    User user = gson.fromJson(request.body(), User.class);
                    UserAPI.add(user);
                    return gson.toJson(new Resp(201, "Resource Created with id [" + user.getId() + "]"));
                });
                put("/:id", (request, response) -> {
                    String id = request.params(":id");
                    if (UserAPI.user(id) == null) {
                        response.type("application/json");
                        response.status(201);
                        User user = gson.fromJson(request.body(), User.class);
                        UserAPI.add(id, user);
                        return gson.toJson(new Resp(201, "Resource Created with id [" + user.getId() + "]"));
                    } else {
                        response.status(409);//conflict
                        return gson.toJson(new Resp(409, id + " already exists"));
                    }
                });
                delete("/:id", (request, response) -> {
                    String id = request.params(":id");
                    if (UserAPI.remove(id) != null) {
                        response.status(200);//conflict
                        return gson.toJson(new Resp(200, "Removed " + id));
                    } else {
                        return gson.toJson(new Resp(404, "Not Exists " + id));
                    }
                });
            });
        });
    }
}
