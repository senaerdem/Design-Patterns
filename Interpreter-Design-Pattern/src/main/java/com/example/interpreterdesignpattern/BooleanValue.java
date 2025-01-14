package com.example.interpreterdesignpattern;
// Terminal Expression: Terminal ifadeleri (true veya false) temsil eder.
class BooleanValue implements BooleanExpression {
    private final boolean value; // Boolean değeri tutar.

    public BooleanValue(boolean value) {
        this.value = value; // Değer constructor ile atanır.
    }

    @Override
    public boolean interpret() {
        return value; // Değeri direkt döndürür.
    }
}