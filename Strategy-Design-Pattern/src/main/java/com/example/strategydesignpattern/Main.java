package com.example.strategydesignpattern;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        // Öğrenciler listesi
        List<Student> students = new ArrayList<>();
        students.add(new Student("Sena", 85));
        students.add(new Student("Beyza", 92));
        students.add(new Student("Melike", 76));
        students.add(new Student("Elifnaz", 90));

        // Context nesnesi oluşturuluyor
        StudentSortContext context = new StudentSortContext();

        // En yüksek nota göre sıralama
        context.setSortingStrategy(new HighestGradeSorting()); // Strateji ayarlanıyor
        context.executeSorting(students); // Sıralama yapılıyor

        // En düşük nota göre sıralama
        context.setSortingStrategy(new LowestGradeSorting());
        context.executeSorting(students);

        // İsme göre alfabetik sıralama
        context.setSortingStrategy(new NameSorting());
        context.executeSorting(students);
    }
}
