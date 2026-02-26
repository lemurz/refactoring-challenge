package edu.iutcs.cr.vehicles;

import java.io.Serializable;

public class Sedan extends Vehicle implements Serializable {

    private boolean hasSunroof;

    public Sedan() {
        super();
    }

    public boolean hasSunroof() {
        return hasSunroof;
    }

    public void setHasSunroof(boolean hasSunroof) {
        this.hasSunroof = hasSunroof;
    }

    @Override
    public String toString() {
        return "Sedan{" + super.toString() + ", " +
                "hasSunroof=" + hasSunroof() +
                "}";
    }
}
