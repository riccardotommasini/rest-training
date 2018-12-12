package it.polimi.deib.middleware.rest.routing;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UserAPI {

    static Map<String, String> users = new HashMap<>();

    public static String user(String uuid) {
        return users.get(uuid);
    }

    public static String add(String uuid) {
        return users.put(uuid, uuid);
    }

    public static String add() {
        UUID key = UUID.randomUUID();
        return users.put(key.toString(), key.toString());
    }

    public static String remove(String uuid) {
        return users.remove(uuid);
    }

    public static Collection<String> users() {
        return users.values();
    }
}
