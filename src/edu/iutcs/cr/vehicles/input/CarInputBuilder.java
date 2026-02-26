package edu.iutcs.cr.vehicles.input;

import edu.iutcs.cr.vehicles.Car;

public class CarInputBuilder extends VehicleInputBuilder {

    public Car buildCar() {
        Car car = new Car();
        
        String registrationNumber = readRegistrationNumber();
        String make = readMake();
        String model = readModel();
        String year = readYear();
        double price = readPrice();
        int seatingCapacity = readSeatingCapacity();

        car.setRegistrationNumber(registrationNumber);
        car.setMake(make);
        car.setModel(model);
        car.setYear(year);
        car.setPrice(price);
        car.setSeatingCapacity(seatingCapacity);

        return car;
    }

    private int readSeatingCapacity() {
        System.out.print("Enter seating capacity: ");
        return inputManager.readInt();
    }
}
