package com.example.builderdesignpattern;

// SUV için ConcreteBuilder
public class SUVCarBuilder implements CarBuilder {
    private Car car;

    public SUVCarBuilder() {
        this.car = new Car();
    }

    @Override
    public void buildFuelType() {
        car.setFuelType("Dizel");
    }

    @Override
    public void buildTransmission() {
        car.setTransmission("Otomatik");
    }

    @Override
    public void buildSeats() {
        car.setSeats(7);
    }

    @Override
    public void buildColor() {
        car.setColor("Siyah");
    }

    @Override
    public Car getCar() {
        return this.car;
    }
}

