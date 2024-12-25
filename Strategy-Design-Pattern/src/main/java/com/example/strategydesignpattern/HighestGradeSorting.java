package com.example.strategydesignpattern;
import java.util.Comparator;
import java.util.List;
// En yüksek nota göre sıralama
public class HighestGradeSorting implements StudentSortingStrategy {
    @Override
    public void sort(List<Student> students) {
        // Öğrenciler, notlarına göre azalan sırayla sıralanır
        students.sort(Comparator.comparingInt(Student::getGrade).reversed());
        System.out.println("En yüksek nota göre sıralama: " + students);
    }
}