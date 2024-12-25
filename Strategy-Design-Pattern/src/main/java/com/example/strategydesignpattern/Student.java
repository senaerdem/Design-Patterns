package com.example.strategydesignpattern;
public class Student {
    private String name; // Öğrencinin ismi
    private int grade;   // Öğrencinin notu

    // Constructor
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
    }

    // Getter ve Setter
    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    // Öğrenci bilgisini yazdırmak için toString metodu
    @Override
    public String toString() {
        return name + " = " + grade;
    }
}
