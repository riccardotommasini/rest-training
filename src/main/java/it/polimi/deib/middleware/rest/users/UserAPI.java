package it.polimi.deib.middleware.rest.users;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class UserAPI {

    static Map<String, User> users = new HashMap<>();

    public static User user(String uuid) {
        return users.get(uuid);
    }

    public static User add(String uuid, User user) {
        user.setId(uuid);
        return users.put(uuid, user);
    }

    public static User add(User user) {
        return add(UUID.randomUUID().toString().split("-")[0], user);
    }

    public static User remove(String uuid) {
        return users.remove(uuid);
    }

    public static Collection<User> users() {
        return users.values();
    }
}
