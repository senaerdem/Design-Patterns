package com.example.flyweightdesignpattern;
// ConcreteFlyweight (Square)
class Square implements Shape {
    private String color; // Şeklin rengi intrinsic state (içsel durum)

    public Square(String color) {
        this.color = color;
    }

    @Override
    public void draw(int x, int y, int size) {
        // Çizim yaparken, pozisyon ve boyut extrinsic state (dışsal durum) olarak sağlanır
        System.out.println("Square of color " + color + " drawn at position (" + x + ", " + y + ") with size " + size);
    }
}