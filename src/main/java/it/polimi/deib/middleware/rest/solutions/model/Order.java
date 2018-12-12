package it.polimi.deib.middleware.rest.solutions.model;


import java.util.List;

public class Order {

    private String id;
    private List<Item> items;
    private Payment payment;

    public Order() {
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
}
