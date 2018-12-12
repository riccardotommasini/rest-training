package it.polimi.deib.middleware.rest.solutions;

public class User {

    private String id;
    private String fullname;
    private String email;
    private String age;

    public User(String fullnanme, String email, String age) {
        this.fullname = fullnanme;
        this.email = email;
        this.age = age;
    }

    public User() {
    }

    public String getFullname() {
        return fullname;
    }

    public String getEmail() {
        return email;
    }

    public String getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "{\"fullname\":\"" + fullname + "\"," +
                "\"id\":\"" + id + "\"," +
                "\"email\":\"" + email + "\"," +
                "\"age\":\"" + age + "\"}";
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
