package it.polimi.deib.middleware.rest.routing;

public class User {

    private String fullnanme;
    private String email;
    private String age;

    public User(String fullnanme, String email, String age) {
        this.fullnanme = fullnanme;
        this.email = email;
        this.age = age;
    }

    public User() {
    }

    public String getFullnanme() {
        return fullnanme;
    }

    public String getEmail() {
        return email;
    }

    public String getAge() {
        return age;
    }
}
