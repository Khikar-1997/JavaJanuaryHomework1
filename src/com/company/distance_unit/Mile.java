package com.company.distance_unit;

public class Mile extends AbstractDistanceUnit {

    public Mile(double distanceUnit) {
        super(distanceUnit);
    }

    public Mile() {
    }

    @Override
    public void getDistance() {
        System.out.println(getDistanceUnit() + "mi");
    }
}
