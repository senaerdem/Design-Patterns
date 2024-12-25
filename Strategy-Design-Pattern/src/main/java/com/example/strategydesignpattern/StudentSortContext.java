package com.example.strategydesignpattern;
import java.util.List;
// Öğrenci sıralama stratejisinin uygulandığı sınıf
public class StudentSortContext {
    private StudentSortingStrategy sortingStrategy; // Sıralama stratejisi

    // Sıralama stratejisini ayarlamak için metot
    public void setSortingStrategy(StudentSortingStrategy sortingStrategy) {
        this.sortingStrategy = sortingStrategy;
    }

    // Sıralama işlemini gerçekleştiren metot
    public void executeSorting(List<Student> students) {
        if (sortingStrategy == null) {
            throw new IllegalStateException("Sıralama stratejisi seçilmedi.");
        }
        sortingStrategy.sort(students); // Stratejiye göre sıralama yapılır
    }
}