package com.nasircode.car;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class CarDAO {
    private static final List<Car> CARS = Arrays.asList(
            new Car(Brand.TESLA,"1234", new BigDecimal("89.00"),true),
            new Car(Brand.AUDI,"5678", new BigDecimal("50.00"),false),
            new Car(Brand.MERCEDES,"5678", new BigDecimal("77.00"),false)
    );

    public static List<Car> getAllCars() {
        return CARS;
    }
}
