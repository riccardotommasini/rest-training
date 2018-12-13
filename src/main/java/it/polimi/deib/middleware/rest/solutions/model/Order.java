package it.polimi.deib.middleware.rest.solutions.model;


import java.util.List;

public class Order {

    private String id;
    private String client;
    private List<Item> items;
    private Payment payment;
    private double price;

    public Order() {
    }

    public Order(String client, List<Item> items1, double price) {
        this.client = client;
        this.items = items1;
        this.price = price;
    }


    public String getId() {
        return id;
    }

    public List<Item> getItems() {
        return items;
    }

    public Payment getPayment() {
        return payment;
    }

    public boolean isPaid() {
        return payment != null;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }
}
