package com.example.observerdesignpattern;
// Observer interface : Abone olacak nesnelerin uyması gereken arayüz
interface Subscriber {
    void notify(String product, boolean isAvailable); // Stok durumu bildirimi yapılacak
}
