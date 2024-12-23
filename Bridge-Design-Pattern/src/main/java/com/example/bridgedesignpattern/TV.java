package com.example.bridgedesignpattern;
// ConcreteImplementor : TV cihazı için davranışların uygulanması
class TV implements Device {
    private int volume; // TV'nin ses seviyesi

    @Override
    public void turnOn() {
        System.out.println("TV is turned ON."); // TV açıldığında mesaj yazdır
    }

    @Override
    public void turnOff() {
        System.out.println("TV is turned OFF."); // TV kapandığında mesaj yazdır
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume; // Ses seviyesini ayarla
        System.out.println("TV volume set to " + this.volume); // Ayarlanmış ses seviyesini yazdır
    }
}