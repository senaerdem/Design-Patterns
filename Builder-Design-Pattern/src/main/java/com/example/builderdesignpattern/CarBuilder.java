package com.example.builderdesignpattern;

// Builder
public interface CarBuilder {
    void buildFuelType(); // Yakıt türünü belirler
    void buildTransmission(); // Vites türünü belirler
    void buildSeats(); // Koltuk sayısını belirler
    void buildColor(); // Arabanın rengini belirler
    Car getCar(); // Build edilen arabanın nesnesini döner
}
