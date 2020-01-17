package com.company.distance_unit;

public class Inch extends AbstractDistanceUnit {
    public Inch(double distanceUnit) {
        super(distanceUnit);
    }

    public Inch() {
    }

    @Override
    public void getDistance() {
        System.out.println(getDistanceUnit() + "in");
    }
}
