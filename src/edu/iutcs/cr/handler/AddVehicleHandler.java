package edu.iutcs.cr.handler;

import edu.iutcs.cr.factory.VehicleFactory;
import edu.iutcs.cr.handler.util.MenuPrompt;
import edu.iutcs.cr.system.SystemDatabase;
import edu.iutcs.cr.util.InputManager;
import edu.iutcs.cr.vehicles.Vehicle;
import edu.iutcs.cr.vehicles.input.*;

public class AddVehicleHandler implements MenuOperationHandler {
    private final SystemDatabase database;
    private final InputManager inputManager;
    private final MenuPrompt menuPrompt;

    public AddVehicleHandler() {
        this.database = SystemDatabase.getInstance();
        this.inputManager = InputManager.getInstance();
        this.menuPrompt = MenuPrompt.getInstance();
    }

    @Override
    public void execute() {
        System.out.println("\n\nAdd new vehicle");
        VehicleFactory.VehicleType vehicleType = selectVehicleType();

        if (vehicleType != null) {
            Vehicle newVehicle = createVehicleWithInput(vehicleType);
            if (newVehicle != null) {
                database.getVehicles().add(newVehicle);
            }
        }

        menuPrompt.promptViewMainMenu();
    }

    @Override
    public String getDescription() {
        return "Add car";
    }

    private VehicleFactory.VehicleType selectVehicleType() {
        System.out.println("Please enter the type of vehicle [1-5]: ");
        
        for (VehicleFactory.VehicleType type : VehicleFactory.VehicleType.values()) {
            System.out.println(type.getCode() + ". " + type.getDisplayName());
        }

        int vehicleTypeCode = inputManager.readIntInRange(1, 5);
        return VehicleFactory.VehicleType.fromCode(vehicleTypeCode);
    }

    private Vehicle createVehicleWithInput(VehicleFactory.VehicleType vehicleType) {
        System.out.println("\n\nCreate new " + vehicleType.getDisplayName());
        
        return switch (vehicleType) {
            case BUS -> new BusInputBuilder().buildBus();
            case CAR -> new CarInputBuilder().buildCar();
            case HATCHBACK -> new HatchbackInputBuilder().buildHatchback();
            case SEDAN -> new SedanInputBuilder().buildSedan();
            case SUV -> new SUVInputBuilder().buildSUV();
        };
    }
}
