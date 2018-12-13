package it.polimi.deib.middleware.rest.solutions;

import it.polimi.deib.middleware.rest.solutions.model.Item;
import it.polimi.deib.middleware.rest.solutions.model.Order;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Barista {

    static Map<String, Order> users = new HashMap<>();
    static Map<String, Item> items = new HashMap<>();
    static Map<String, Integer> stock = new HashMap<>();

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

    public static void place(Item item) {
        items.put(item.getName(), item);
    }

    public static Item item(String i) {
        return items.get(i);
    }
}
