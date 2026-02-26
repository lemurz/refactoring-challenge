package edu.iutcs.cr.factory;

import edu.iutcs.cr.vehicles.*;

public class VehicleFactory {

    public enum VehicleType {
        BUS(1, "Bus"),
        CAR(2, "Car"),
        HATCHBACK(3, "Hatchback"),
        SEDAN(4, "Sedan"),
        SUV(5, "SUV");

        private final int code;
        private final String displayName;

        VehicleType(int code, String displayName) {
            this.code = code;
            this.displayName = displayName;
        }

        public int getCode() {
            return code;
        }

        public String getDisplayName() {
            return displayName;
        }

        public static VehicleType fromCode(int code) {
            for (VehicleType type : VehicleType.values()) {
                if (type.code == code) {
                    return type;
                }
            }
            return null;
        }
    }

    public static Vehicle createVehicle(VehicleType type) {
        if (type == null) {
            throw new IllegalArgumentException("Vehicle type cannot be null");
        }

        return switch (type) {
            case BUS -> new Bus();
            case CAR -> new Car();
            case HATCHBACK -> new Hatchback();
            case SEDAN -> new Sedan();
            case SUV -> new SUV();
        };
    }
}
