package edu.iutcs.cr.persons.input;

import edu.iutcs.cr.persons.Buyer;

public class BuyerInputBuilder extends PersonInputBuilder {

    public Buyer buildBuyer() {
        String name = readName();
        String id = readId();
        String email = readEmail();
        String paymentMethod = readPaymentMethod();

        Buyer buyer = new Buyer(id);
        buyer.setName(name);
        buyer.setEmail(email);
        buyer.setPaymentMethod(paymentMethod);
        
        return buyer;
    }

    private String readPaymentMethod() {
        String paymentMethod = null;
        while (paymentMethod == null || paymentMethod.isBlank()) {
            System.out.print("Enter payment method: ");
            paymentMethod = inputManager.readLine();
            if (paymentMethod == null || paymentMethod.isBlank()) {
                System.out.println("Payment method is mandatory!");
            }
        }
        return paymentMethod;
    }
}
