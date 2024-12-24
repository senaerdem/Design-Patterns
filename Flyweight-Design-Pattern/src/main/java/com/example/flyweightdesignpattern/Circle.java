package com.example.flyweightdesignpattern;
// ConcreteFlyweight (Circle)
class Circle implements Shape {
    private String color; // Şeklin rengi intrinsic state (içsel durum)

    public Circle(String color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y, int size) {
        // Çizim yaparken, pozisyon ve boyut extrinsic state (dışsal durum) olarak sağlanır
        System.out.println("Circle of color " + color + " drawn at position (" + x + ", " + y + ") with size " + size);
    }
}