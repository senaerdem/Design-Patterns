package com.example.templatedesignpattern;
public class Main {
    public static void main(String[] args) {
        System.out.println("Veritabanı Verileri İşleniyor:");
        // Veritabanı için veri işleme sürecini çalıştır
        DataProcessor databaseProcessor = new DatabaseDataProcessor();
        databaseProcessor.processData();

        System.out.println("\nDosya Verileri İşleniyor:");
        // Dosya için veri işleme sürecini çalıştır
        DataProcessor fileProcessor = new FileDataProcessor();
        fileProcessor.processData();
    }
}