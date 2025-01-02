package com.example.templatedesignpattern;
// Dosyadan veri işleme sınıfı
class FileDataProcessor extends DataProcessor {
    @Override
    protected void fetchData() {
        System.out.println("Dosyadan veri alınıyor.");
    }

    @Override
    protected void process() {
        System.out.println("Dosyadan alınan veri işleniyor.");
    }

    @Override
    protected void saveData() {
        System.out.println("İşlenmiş veri dosyaya kaydediliyor.");
    }
}