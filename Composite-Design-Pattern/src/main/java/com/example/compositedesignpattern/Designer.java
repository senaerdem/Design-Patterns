package com.example.compositedesignpattern;

// Leaf Component - Designer
class Designer implements Employee {
    private String name; // Designer adı
    private String position; // Designer pozisyonu

    // Constructor
    public Designer(String name, String position) {
        this.name = name;
        this.position = position;
    }

    // Designer bilgilerini ekrana yazdırmak için method.
    @Override
    public void showDetails() {
        System.out.println("Designer: " + name + " - Position: " + position);
    }
}