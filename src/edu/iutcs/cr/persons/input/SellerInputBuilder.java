package edu.iutcs.cr.persons.input;

import edu.iutcs.cr.persons.Seller;

public class SellerInputBuilder extends PersonInputBuilder {

    public Seller buildSeller() {
        String name = readName();
        String id = readId();
        String email = readEmail();

        Seller seller = new Seller(id);
        seller.setName(name);
        seller.setEmail(email);
        
        return seller;
    }
}
