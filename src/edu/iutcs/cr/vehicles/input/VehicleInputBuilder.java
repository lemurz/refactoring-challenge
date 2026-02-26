package edu.iutcs.cr.vehicles.input;

import edu.iutcs.cr.util.InputManager;
import edu.iutcs.cr.vehicles.Vehicle;

public class VehicleInputBuilder {
    protected final InputManager inputManager;

    public VehicleInputBuilder() {
        this.inputManager = InputManager.getInstance();
    }

    public Vehicle buildVehicle() {
        Vehicle vehicle = new Vehicle();
        
        String registrationNumber = readRegistrationNumber();
        String make = readMake();
        String model = readModel();
        String year = readYear();
        double price = readPrice();

        vehicle.setRegistrationNumber(registrationNumber);
        vehicle.setMake(make);
        vehicle.setModel(model);
        vehicle.setYear(year);
        vehicle.setPrice(price);

        return vehicle;
    }

    protected String readRegistrationNumber() {
        String registrationNumber = null;
        while (registrationNumber == null || registrationNumber.isBlank()) {
            System.out.print("Enter registration number: ");
            registrationNumber = inputManager.readLine();
            if (registrationNumber == null || registrationNumber.isBlank()) {
                System.out.println("Registration number is mandatory!");
            }
        }
        return registrationNumber;
    }

    protected String readMake() {
        String make = null;
        while (make == null || make.isBlank()) {
            System.out.print("Enter make: ");
            make = inputManager.readLine();
            if (make == null || make.isBlank()) {
                System.out.println("Make is mandatory!");
            }
        }
        return make;
    }

    protected String readModel() {
        String model = null;
        while (model == null || model.isBlank()) {
            System.out.print("Enter model: ");
            model = inputManager.readLine();
            if (model == null || model.isBlank()) {
                System.out.println("Model is mandatory!");
            }
        }
        return model;
    }

    protected String readYear() {
        String year = null;
        while (year == null || year.isBlank()) {
            System.out.print("Enter year: ");
            year = inputManager.readLine();
            if (year == null || year.isBlank()) {
                System.out.println("Year is mandatory!");
            }
        }
        return year;
    }

    protected double readPrice() {
        System.out.print("Enter price: ");
        return inputManager.readInt();
    }
}
