package com.company.distance_unit;

public class Centimeter extends AbstractDistanceUnit {
    public Centimeter(double distanceUnit) {
        super(distanceUnit);
    }

    public Centimeter() {
    }

    @Override
    public void getDistance() {
        System.out.println(getDistanceUnit() + "cm");
    }
}
