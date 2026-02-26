package edu.iutcs.cr.persons.factory;

import edu.iutcs.cr.persons.Buyer;
import edu.iutcs.cr.persons.Person;
import edu.iutcs.cr.persons.Seller;

public class PersonFactory {

    public static Person createPerson(String id) {
        return new Person(id);
    }

    public static Buyer createBuyer(String id) {
        return new Buyer(id);
    }

    public static Seller createSeller(String id) {
        return new Seller(id);
    }
}
