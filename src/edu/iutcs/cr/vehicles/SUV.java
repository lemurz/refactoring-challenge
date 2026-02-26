package edu.iutcs.cr.vehicles;

import java.io.Serializable;

public class SUV extends Vehicle implements Serializable {

    private boolean isOffRoad;

    public SUV() {
        super();
    }

    public boolean isOffRoad() {
        return isOffRoad;
    }

    public void setOffRoad(boolean isOffRoad) {
        this.isOffRoad = isOffRoad;
    }

    @Override
    public String toString() {
        return "SUV{" + super.toString() + ", " +
                "isOffRoad=" + isOffRoad() +
                "}";
    }
}
