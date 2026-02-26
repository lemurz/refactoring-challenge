package edu.iutcs.cr.display;

import edu.iutcs.cr.Invoice;
import edu.iutcs.cr.persons.Buyer;
import edu.iutcs.cr.persons.Seller;
import edu.iutcs.cr.vehicles.Vehicle;

import java.util.Set;

public class SystemDisplay {

    public void displayInventory(Set<Vehicle> vehicles) {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles is present in system");
            return;
        }

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.toString());
        }
    }

    public void displayBuyerList(Set<Buyer> buyers) {
        if (buyers.isEmpty()) {
            System.out.println("No buyer is present in system");
            return;
        }

        for (Buyer buyer : buyers) {
            System.out.println(buyer.toString());
        }
    }

    public void displaySellerList(Set<Seller> sellers) {
        if (sellers.isEmpty()) {
            System.out.println("No seller is present in system");
            return;
        }

        for (Seller seller : sellers) {
            System.out.println(seller.toString());
        }
    }

    public void displayInvoices(Set<Invoice> invoices) {
        if (invoices.isEmpty()) {
            System.out.println("No invoice found in system");
            return;
        }

        for (Invoice invoice : invoices) {
            invoice.printInvoice();
            System.out.println("\n\n\n");
        }
    }
}
