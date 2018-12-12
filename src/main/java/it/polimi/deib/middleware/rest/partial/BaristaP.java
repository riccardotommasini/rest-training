package it.polimi.deib.middleware.rest.partial;

import it.polimi.deib.middleware.rest.solutions.model.Order;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class BaristaP {

    static Map<String, Order> users = new HashMap<>();

    public static Order order(String uuid) {
        return users.get(uuid);
    }

    public static Order place(String uuid, Order order) {
        order.setId(uuid);
        return users.put(uuid, order);
    }

    public static Order place(Order oder) {

        return place(UUID.randomUUID().toString().split("-")[0], oder);
    }

    public static Order remove(String uuid) {
        return users.remove(uuid);
    }

    public static Collection<Order> orders() {
        return users.values();
    }

}
