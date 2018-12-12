package it.polimi.deib.middleware.rest.partial;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static spark.Spark.before;
import static spark.Spark.path;

public class RestbucksP {

    static Logger logger = LoggerFactory.getLogger(RestbucksP.class);

    public static void main(String[] args) {
        Gson gson = new Gson();

        path("/api", () -> {
            before("/*", (q, a) -> logger.info("Received api call"));

            //TODO get recepts get("/receipts/:order", (request, response) -> gson.toJson(BaristaP.order(request.params(":order"))));

            //TODO pay an order, return 201 if correct

            path("/orders", () -> {
                //TODO get orders
                //TODO get a specific order
                //TODO create an order
                //TODO modify an order
            });
        });
    }
}
