package com.example.prototypedesignpattern;
// Prototype interface
public interface Product {
    Product clone(); // Nesnenin kopyasını oluşturur.
    void showDetails(); // Ürün detaylarını gösterir.
}
