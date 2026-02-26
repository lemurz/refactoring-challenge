package edu.iutcs.cr.vehicles.input;

import edu.iutcs.cr.vehicles.Bus;

public class BusInputBuilder extends VehicleInputBuilder {

    public Bus buildBus() {
        Bus bus = new Bus();
        
        String registrationNumber = readRegistrationNumber();
        String make = readMake();
        String model = readModel();
        String year = readYear();
        double price = readPrice();
        int passengerCapacity = readPassengerCapacity();

        bus.setRegistrationNumber(registrationNumber);
        bus.setMake(make);
        bus.setModel(model);
        bus.setYear(year);
        bus.setPrice(price);
        bus.setPassengerCapacity(passengerCapacity);

        return bus;
    }

    private int readPassengerCapacity() {
        System.out.print("Enter passenger capacity: ");
        return inputManager.readInt();
    }
}
