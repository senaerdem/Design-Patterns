package com.example.prototypedesignpattern;
// ConcretePrototype: Laptop
// Prototype arayüzünü implement eden ve nesnelerin kopyalanmasını sağlayan sınıf.
public class Laptop implements Product {
    private String brand; // Marka adı
    private String model; // Model adı
    private double price; // Fiyat

    // Laptop sınıfının constructor'ı
    public Laptop(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Nesnenin kopyasını yaratır
    @Override
    public Product clone() {
        // Kendi nesnemizin kopyasını yaratıyoruz.
        return new Laptop(this.brand, this.model, this.price);
        // Yeni bir Laptop nesnesi döndürülür, bu yeni nesne orijinal nesne ile aynı özelliklere sahiptir.
    }

    // Laptop nesnesinin detaylarını yazdırır
    @Override
    public void showDetails() {
        System.out.println("Laptop [Brand=" + brand + ", Model=" + model + ", Price=" + price + "]");
    }
}