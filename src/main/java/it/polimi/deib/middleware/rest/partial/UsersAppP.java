package it.polimi.deib.middleware.rest.partial;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static spark.Spark.*;

public class UsersAppP {

    static Logger logger = LoggerFactory.getLogger(UsersAppP.class);

    public static void main(String[] args) {
        Gson gson = new Gson();

        path("/api", () -> {

            //TODO path users

                //TODO get all users

                //TODO get a user

                //TODO idenpotent user creation

                //TODO not idenpotent user creation

                //TODO user deletion

        });
    }
}
