package com.company;

import com.company.converter.DistanceConverter;
import com.company.distance_unit.*;

public class Main {

    public static void main(String[] args) {
        DistanceConverter distanceConverter = new DistanceConverter();
        Mile mile = new Mile(10.5);
        Meter meter = new Meter(150);
        Inch inch = new Inch(100.8);
        Centimeter centimeter = new Centimeter(22.6);

        AbstractDistanceUnit convertMeterToMile = distanceConverter.convertMetersToMiles(meter);
        convertMeterToMile.getDistance();

        AbstractDistanceUnit convertMileToMeter = distanceConverter.convertMilesToMeters(mile);
        convertMileToMeter.getDistance();

        AbstractDistanceUnit convertCentimeterToInch = distanceConverter.convertCentimeterToInch(centimeter);
        convertCentimeterToInch.getDistance();

        AbstractDistanceUnit convertInchToCentimeter = distanceConverter.convertInchToCentimeter(inch);
        convertInchToCentimeter.getDistance();
    }
}
