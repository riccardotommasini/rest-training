package it.polimi.deib.middleware.rest.stub;

import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static spark.Spark.path;

public class RestbucksStub {

    static Logger logger = LoggerFactory.getLogger(RestbucksStub.class);

    public static void main(String[] args) {
        path("/api", () -> {

            //TODO orders

            //TODO payments

        });
    }
}
