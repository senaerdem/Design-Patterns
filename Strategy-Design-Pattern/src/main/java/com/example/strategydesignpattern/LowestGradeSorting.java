package com.example.strategydesignpattern;
import java.util.Comparator;
import java.util.List;
// En düşük nota göre sıralama
public class LowestGradeSorting implements StudentSortingStrategy {
    @Override
    public void sort(List<Student> students) {
        // Öğrenciler, notlarına göre artan sırayla sıralanır
        students.sort(Comparator.comparingInt(Student::getGrade));
        System.out.println("En düşük nota göre sıralama: " + students);
    }
}