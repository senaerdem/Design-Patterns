package com.example.builderdesignpattern;

// Client
public class Main {
    public static void main(String[] args) {
        // SUV building
        CarBuilder suvBuilder = new SUVCarBuilder();
        CarDirector director = new CarDirector();
        director.construct(suvBuilder);
        Car suv = suvBuilder.getCar();
        suv.displayInfo();

        // Sedan building
        CarBuilder sedanBuilder = new SedanCarBuilder();
        director.construct(sedanBuilder);
        Car sedan = sedanBuilder.getCar();
        sedan.displayInfo();
    }
}
