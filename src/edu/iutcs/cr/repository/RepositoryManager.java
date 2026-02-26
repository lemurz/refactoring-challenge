package edu.iutcs.cr.repository;

import edu.iutcs.cr.Invoice;
import edu.iutcs.cr.persons.Buyer;
import edu.iutcs.cr.persons.Seller;
import edu.iutcs.cr.vehicles.Vehicle;

import java.util.Set;

public class RepositoryManager implements BuyerRepository, SellerRepository, VehicleRepository {
    private final Set<Buyer> buyers;
    private final Set<Seller> sellers;
    private final Set<Vehicle> vehicles;

    public RepositoryManager(Set<Buyer> buyers, Set<Seller> sellers, Set<Vehicle> vehicles) {
        this.buyers = buyers;
        this.sellers = sellers;
        this.vehicles = vehicles;
    }

    @Override
    public Vehicle findByRegistrationNumber(String registrationNumber) {
        Vehicle searchVehicle = new Vehicle(registrationNumber);
        for (Vehicle vehicle : vehicles) {
            if (vehicle.equals(searchVehicle)) {
                return vehicle;
            }
        }
        return null;
    }

    @Override
    public Buyer findById(String id) {
        Buyer searchBuyer = new Buyer(id);
        for (Buyer buyer : buyers) {
            if (buyer.equals(searchBuyer)) {
                return buyer;
            }
        }
        return null;
    }

    @Override
    public Seller findById(String id) {
        Seller searchSeller = new Seller(id);
        for (Seller seller : sellers) {
            if (seller.equals(searchSeller)) {
                return seller;
            }
        }
        return null;
    }
}
