package com.example.flyweightdesignpattern;
// Flyweight Arayüzü
interface Shape {
    // Çizim yapacak metot, şeklin konumunu ve boyutunu alır
    void draw(int x, int y, int size);
}