package edu.iutcs.cr.vehicles.input;

import edu.iutcs.cr.vehicles.Sedan;

public class SedanInputBuilder extends VehicleInputBuilder {

    public Sedan buildSedan() {
        Sedan sedan = new Sedan();
        
        String registrationNumber = readRegistrationNumber();
        String make = readMake();
        String model = readModel();
        String year = readYear();
        double price = readPrice();
        boolean hasSunroof = readHasSunroof();

        sedan.setRegistrationNumber(registrationNumber);
        sedan.setMake(make);
        sedan.setModel(model);
        sedan.setYear(year);
        sedan.setPrice(price);
        sedan.setHasSunroof(hasSunroof);

        return sedan;
    }

    private boolean readHasSunroof() {
        System.out.print("Does the sedan have a sunroof? (true/false): ");
        return Boolean.parseBoolean(inputManager.readString());
    }
}
