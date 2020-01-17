package com.company.converter;

import com.company.distance_unit.*;

public class DistanceConverter {
    public AbstractDistanceUnit convertMilesToMeters(AbstractDistanceUnit unit) {
        double mileToMeter;
        if (unit instanceof Mile) {
            mileToMeter = 1639 * unit.getDistanceUnit();
        } else {
            mileToMeter = unit.getDistanceUnit();
        }
        Meter meter = new Meter();
        meter.setDistanceUnit(mileToMeter);
        return meter;
    }

    public AbstractDistanceUnit convertMetersToMiles(AbstractDistanceUnit unit) {
        double meterToMile;
        if (unit instanceof Meter) {
            meterToMile = unit.getDistanceUnit() / 1639;
        } else {
            meterToMile = unit.getDistanceUnit();
        }
        Mile mile = new Mile();
        mile.setDistanceUnit(meterToMile);
        return mile;
    }

    public AbstractDistanceUnit convertInchToCentimeter(AbstractDistanceUnit unit) {
        double inchToCentimeter;
        if (unit instanceof Inch) {
            inchToCentimeter = 2.473 * unit.getDistanceUnit();
        } else {
            inchToCentimeter = unit.getDistanceUnit();
        }

        Centimeter centimeter = new Centimeter();
        centimeter.setDistanceUnit(inchToCentimeter);
        return centimeter;
    }

    public AbstractDistanceUnit convertCentimeterToInch(AbstractDistanceUnit unit) {
        double centimeterToInch;
        if (unit instanceof Centimeter) {
            centimeterToInch = unit.getDistanceUnit() / 2.632;
        } else {
            centimeterToInch = unit.getDistanceUnit();
        }
        Inch inch = new Inch();
        inch.setDistanceUnit(centimeterToInch);
        return inch;
    }
}
