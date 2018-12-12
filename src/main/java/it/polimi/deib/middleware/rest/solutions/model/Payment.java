package it.polimi.deib.middleware.rest.solutions.model;

public class Payment {

    private String currency;
    private double ammount;

    public Payment() {
    }

    public Payment(String currency, double ammount) {
        this.currency = currency;
        this.ammount = ammount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }


}
