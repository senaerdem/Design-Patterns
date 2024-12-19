package com.example.prototypedesignpattern;
// Client class: Kopyalama işini yapan sınıf
public class Main {
    public static void main(String[] args) {
        // Orijinal ürünler
        Product laptop1 = new Laptop("Lenovo", "ThinkPad", 33000.00);
        Product phone1 = new Phone("Apple", "iPhone 15", 52000.00);

        // Ürünleri kopyala
        Product laptop2 = laptop1.clone();
        Product phone2 = phone1.clone();

        // Orijinal ürünleri göster
        System.out.println("Original Products:");
        laptop1.showDetails();
        phone1.showDetails();

        // Kopyalanan ürünleri göster
        System.out.println("\nCloned Products:");
        laptop2.showDetails();
        phone2.showDetails();
    }
}
