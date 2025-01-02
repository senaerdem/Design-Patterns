package com.example.templatedesignpattern;
// Veritabanından veri işleme sınıfı
class DatabaseDataProcessor extends DataProcessor {
    @Override
    protected void fetchData() {
        System.out.println("Veritabanından veri alınıyor.");
    }

    @Override
    protected void process() {
        System.out.println("Veritabanından alınan veri işleniyor.");
    }

    @Override
    protected void saveData() {
        System.out.println("İşlenmiş veri veritabanına kaydediliyor.");
    }
}