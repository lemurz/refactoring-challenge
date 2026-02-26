package edu.iutcs.cr.persons;

import java.io.Serializable;

public class Buyer extends Person implements Serializable {

    private String paymentMethod;

    public Buyer() {
        super();
    }

    public Buyer(String id) {
        super(id);
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", paymentMethod='" + paymentMethod + '\'';
    }
}
