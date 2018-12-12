package it.polimi.deib.middleware.rest.icebreak;


import static spark.Spark.get;
import static spark.Spark.post;

public class Application {


    public static void main(String[] args) {

        get("/hello", (request, response) -> "world");

        //http://localhost:4567/hello
        post("world", (request, response) -> "hello");

    }

}
