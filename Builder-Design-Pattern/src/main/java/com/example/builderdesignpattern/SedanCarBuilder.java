package com.example.builderdesignpattern;

// Sedan için ConcreteBuilder
public class SedanCarBuilder implements CarBuilder {
    private Car car;

    public SedanCarBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildFuelType() {
        car.setFuelType("Benzin");
    }

    @Override
    public void buildTransmission() {
        car.setTransmission("Manuel");
    }

    @Override
    public void buildSeats() {
        car.setSeats(5);
    }

    @Override
    public void buildColor() {
        car.setColor("Beyaz");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}
