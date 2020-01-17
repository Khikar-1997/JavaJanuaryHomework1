package com.company.distance_unit;

public class Meter extends AbstractDistanceUnit {
    public Meter(double distanceUnit) {
        super(distanceUnit);
    }

    public Meter() {
    }

    @Override
    public void getDistance() {
        System.out.println(getDistanceUnit() + "m");
    }
}
