package edu.iutcs.cr.vehicles.input;

import edu.iutcs.cr.vehicles.Hatchback;

public class HatchbackInputBuilder extends VehicleInputBuilder {

    public Hatchback buildHatchback() {
        Hatchback hatchback = new Hatchback();
        
        String registrationNumber = readRegistrationNumber();
        String make = readMake();
        String model = readModel();
        String year = readYear();
        double price = readPrice();
        boolean isCompact = readIsCompact();

        hatchback.setRegistrationNumber(registrationNumber);
        hatchback.setMake(make);
        hatchback.setModel(model);
        hatchback.setYear(year);
        hatchback.setPrice(price);
        hatchback.setCompact(isCompact);

        return hatchback;
    }

    private boolean readIsCompact() {
        System.out.print("Is the hatchback compact? (true/false): ");
        return Boolean.parseBoolean(inputManager.readString());
    }
}
