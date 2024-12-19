package com.example.prototypedesignpattern;
// ConcretePrototype: Phone
// Prototype arayüzünü implement eden ve nesnelerin kopyalanmasını sağlayan sınıf.
public class Phone implements Product {
    private String brand; // Marka adı
    private String model; // Model adı
    private double price; // Fiyat

    // Laptop sınıfının constructor'ı
    public Phone(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Nesnenin kopyasını yaratır
    @Override
    public Product clone() {
        // Kendi nesnemizin kopyasını yaratıyoruz.
        return new Phone(this.brand, this.model, this.price);
        // Yeni bir Phone nesnesi döndürülür, bu yeni nesne orijinal nesne ile aynı özelliklere sahiptir.
    }

    // Phone nesnesinin detaylarını yazdırır
    @Override
    public void showDetails() {
        System.out.println("Phone [Brand=" + brand + ", Model=" + model + ", Price=" + price + "]");
    }
}