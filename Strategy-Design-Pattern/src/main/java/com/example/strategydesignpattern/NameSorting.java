package com.example.strategydesignpattern;
import java.util.Comparator;
import java.util.List;
// İsme göre alfabetik sıralama
public class NameSorting implements StudentSortingStrategy {
    @Override
    public void sort(List<Student> students) {
        // Öğrenciler, isimlerine göre alfabetik sırayla sıralanır
        students.sort(Comparator.comparing(Student::getName));
        System.out.println("İsme göre alfabetik sıralama: " + students);
    }
}