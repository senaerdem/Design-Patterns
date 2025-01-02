package com.example.templatedesignpattern;
// Veri işleme için template tanımlayan soyut sınıf
abstract class DataProcessor {
    // Template metodu
    public final void processData() {
        fetchData();  // Veriyi al
        process();    // Veriyi işle
        saveData();   // İşlenmiş veriyi kaydet
    }

    // Alt sınıfların uygulaması gereken soyut metotlar
    protected abstract void fetchData();
    protected abstract void process();
    protected abstract void saveData();
}