package com.example.strategydesignpattern;
import java.util.List;

// Öğrenci sıralama stratejisini tanımlayan interface
public interface StudentSortingStrategy {
    // Öğrenciler listesini sıralamak için bir metot
    void sort(List<Student> students);
}
