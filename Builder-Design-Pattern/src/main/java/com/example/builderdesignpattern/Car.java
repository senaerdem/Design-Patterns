package com.example.builderdesignpattern;

// Product
public class Car {
    private String fuelType; // Yakıt türü
    private String transmission; // Vites türü
    private int seats; // Koltuk sayısı
    private String color; // Renk

    // Setter metodlar
    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // Bilgileri göstermek için bir metod
    public void displayInfo() {
        System.out.println("Araba Özellikleri");
        System.out.println("->> Yakıt türü: " + fuelType);
        System.out.println("->> Vites: " + transmission);
        System.out.println("->> Koltuk Sayısı: " + seats);
        System.out.println("->> Renk: " + color);
    }
}
