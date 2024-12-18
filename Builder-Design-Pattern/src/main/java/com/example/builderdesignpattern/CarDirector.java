package com.example.builderdesignpattern;

// Director
public class CarDirector {
    public void construct(CarBuilder builder) {
        builder.buildFuelType();
        builder.buildTransmission();
        builder.buildSeats();
        builder.buildColor();
    }
}
