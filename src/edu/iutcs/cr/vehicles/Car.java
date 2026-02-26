package edu.iutcs.cr.vehicles;

import java.io.Serializable;

public class Car extends Vehicle implements Serializable {

    private int seatingCapacity;

    public Car() {
        super();
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public String toString() {
        return "Car{" + super.toString() + ", " +
                "seatingCapacity=" + getSeatingCapacity() +
                "}";
    }
}
