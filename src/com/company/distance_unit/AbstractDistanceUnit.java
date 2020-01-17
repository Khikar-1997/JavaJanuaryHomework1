package com.company.distance_unit;

public abstract class AbstractDistanceUnit {
    private double distanceUnit;

    public AbstractDistanceUnit(double distanceUnit) {
        this.distanceUnit = distanceUnit;
    }

    public AbstractDistanceUnit() {
    }

    public abstract void getDistance();

    public double getDistanceUnit() {
        return distanceUnit;
    }

    public void setDistanceUnit(double distanceUnit) {
        this.distanceUnit = distanceUnit;
    }
}
