package edu.iutcs.cr.vehicles.input;

import edu.iutcs.cr.vehicles.SUV;

public class SUVInputBuilder extends VehicleInputBuilder {

    public SUV buildSUV() {
        SUV suv = new SUV();
        
        String registrationNumber = readRegistrationNumber();
        String make = readMake();
        String model = readModel();
        String year = readYear();
        double price = readPrice();
        boolean isOffRoad = readIsOffRoad();

        suv.setRegistrationNumber(registrationNumber);
        suv.setMake(make);
        suv.setModel(model);
        suv.setYear(year);
        suv.setPrice(price);
        suv.setOffRoad(isOffRoad);

        return suv;
    }

    private boolean readIsOffRoad() {
        System.out.print("Is the SUV for off-road use? (true/false): ");
        return Boolean.parseBoolean(inputManager.readString());
    }
}
