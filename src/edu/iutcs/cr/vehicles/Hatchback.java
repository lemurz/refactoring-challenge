package edu.iutcs.cr.vehicles;

import java.io.Serializable;

public class Hatchback extends Vehicle implements Serializable {

    private boolean isCompact;

    public Hatchback() {
        super();
    }

    public boolean isCompact() {
        return isCompact;
    }

    public void setCompact(boolean isCompact) {
        this.isCompact = isCompact;
    }

    @Override
    public String toString() {
        return "Hatchback{" + super.toString() + ", " +
                "isCompact=" + isCompact() +
                "}";
    }
}
