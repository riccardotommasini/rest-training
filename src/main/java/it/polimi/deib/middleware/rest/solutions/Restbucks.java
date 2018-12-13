package it.polimi.deib.middleware.rest.solutions;

import com.google.gson.Gson;
import it.polimi.deib.middleware.rest.Resp;
import it.polimi.deib.middleware.rest.solutions.model.Item;
import it.polimi.deib.middleware.rest.solutions.model.Order;
import it.polimi.deib.middleware.rest.solutions.model.Payment;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static spark.Spark.*;

public class Restbucks {

    static Logger logger = LoggerFactory.getLogger(Restbucks.class);

    public static void main(String[] args) {
        Gson gson = new Gson();

        path("/api", () -> {
            before("/*", (q, a) -> logger.info("Received api call"));

            get("/receipts/:order", (request, response) -> gson.toJson(Barista.order(request.params(":order"))));

            path("/items", () -> {

                post("", (request, response) -> {
                    response.type("application/json");
                    response.status(201);
                    String body = request.body();
                    Item item = gson.fromJson(body, Item.class);
                    Barista.place(item);
                    return gson.toJson(new Resp(201, "Created Item  [" + item.getName() + "]"));
                });


            });

            path("/payments", () -> {
                //Note also PATCH would be a good method here
                post("/:order", (request, response) -> {
                    response.type("application/json");
                    String id = request.params(":order");

                    Order order = Barista.order(id);

                    if (order != null) {

                        order.setPayment(gson.fromJson(request.body(), Payment.class));
                        Barista.place(order.getId(), order);
                        response.status(201);
                        return gson.toJson(new Resp(201, "Payment received for order id [" + order.getId() + "]"));

                    } else
                        return gson.toJson(new Resp(404, "Order not found id [" + order.getId() + "]"));

                });
            });

            path("/orders", () -> {
                get("", (request, response) -> gson.toJson(Barista.orders()));
                get("/:id", (request, response) -> gson.toJson(Barista.order(request.params(":id"))));
                post("", (request, response) -> {
                    response.type("application/json");
                    response.status(201);
                    String body = request.body();

                    try {
                        Map msg = gson.fromJson(body, Map.class);

                        List<String> items = (List<String>) msg.get("items");

                        List<Item> items1 = new ArrayList<>();

                        double price = 0D;

                        for (String i : items) {
                            Item item = Barista.item(i);
                            if (item != null) {
                                items1.add(item);
                                price += item.getPrice();
                            } else {
                                return gson.toJson(new Resp(400, "Unknown item with id [" + i + "]"));
                            }
                        }

                        Order order = new Order((String) msg.get("client"), items1, price);

                        Barista.place(order);

                        return gson.toJson(new Resp(201, "Order Created with id [" + order.getId() + "]"));

                    } catch (ClassCastException e) {
                        response.status(500);
                        return gson.toJson(new Resp(500, "Cannot process order"));

                    }
                });
                //Used for edit the order
                put("/:id", (request, response) -> {
                    String id = request.params(":id");
                    response.type("application/json");
                    response.status(201);
                    Order order = gson.fromJson(request.body(), Order.class);
                    Barista.place(id, order);
                    return gson.toJson(new Resp(201, "Order [" + order.getId() + "] successfully Changed"));
                });
                delete("/:id", (request, response) -> {
                    String id = request.params(":id");
                    if (Barista.remove(id) != null) {
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
