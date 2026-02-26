package edu.iutcs.cr.system;

import edu.iutcs.cr.Invoice;
import edu.iutcs.cr.persons.Buyer;
import edu.iutcs.cr.persons.Seller;
import edu.iutcs.cr.repository.RepositoryManager;
import edu.iutcs.cr.display.SystemDisplay;
import edu.iutcs.cr.vehicles.Vehicle;

import java.io.Serializable;
import java.util.Set;

import static java.util.Objects.isNull;

public class SystemDatabase implements Serializable {

    private Set<Buyer> buyers;
    private Set<Seller> sellers;
    private Set<Vehicle> vehicles;
    private Set<Invoice> invoices;
    private RepositoryManager repositoryManager;
    private SystemDisplay systemDisplay;

    private static SystemDatabase instance;

    private SystemDatabase() {
        DataStore dataStore = new DataStore();

        buyers = dataStore.loadBuyers();
        sellers = dataStore.loadSellers();
        vehicles = dataStore.loadVehicles();
        invoices = dataStore.loadInvoices();
        
        this.repositoryManager = new RepositoryManager(buyers, sellers, vehicles);
        this.systemDisplay = new SystemDisplay();
    }

    public static SystemDatabase getInstance() {
        if (isNull(instance)) {
            instance = new SystemDatabase();
        }

        return instance;
    }

    public void saveSystem() {
        DataStore dataStore = new DataStore();

        dataStore.saveBuyers(buyers);
        dataStore.saveSellers(sellers);
        dataStore.saveVehicles(vehicles);
        dataStore.saveInvoices(invoices);
    }

    public Set<Buyer> getBuyers() {
        return buyers;
    }

    public Set<Seller> getSellers() {
        return sellers;
    }

    public Set<Vehicle> getVehicles() {
        return vehicles;
    }

    public Set<Invoice> getInvoices() {
        return invoices;
    }

    public void showInventory() {
        systemDisplay.displayInventory(vehicles);
    }

    public void showBuyerList() {
        systemDisplay.displayBuyerList(buyers);
    }

    public void showSellerList() {
        systemDisplay.displaySellerList(sellers);
    }

    public void showInvoices() {
        systemDisplay.displayInvoices(invoices);
    }

    public Vehicle findVehicleByRegistrationNumber(String registrationNumber) {
        return repositoryManager.findByRegistrationNumber(registrationNumber);
    }

    public Buyer findBuyerById(String id) {
        return repositoryManager.findById(id);
    }

    public Seller findSellerById(String id) {
        return repositoryManager.findById(id);
    }
}
