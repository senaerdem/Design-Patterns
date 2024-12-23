package com.example.compositedesignpattern;

// Leaf Component - Developer
// Developerlar en alt seviyede yer alır ve başka alt birim içermez.
class Developer implements Employee {
    private String name; // Developer adı
    private String position; // Developer pozisyonu

    // Constructor
    public Developer(String name, String position) {
        this.name = name;
        this.position = position;
    }

    // Developer bilgilerini ekrana yazdırmak için method.
    @Override
    public void showDetails() {
        System.out.println("Developer: " + name + " - Position: " + position);
    }
}