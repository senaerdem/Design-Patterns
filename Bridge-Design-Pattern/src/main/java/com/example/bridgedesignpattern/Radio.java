package com.example.bridgedesignpattern;
// ConcreteImplementor : Radio cihazı için davranışların uygulanması
class Radio implements Device {
    private int volume; // Radyonun ses seviyesi

    @Override
    public void turnOn() {
        System.out.println("Radio is turned ON."); // Radyo açıldığında mesaj yazdır
    }

    @Override
    public void turnOff() {
        System.out.println("Radio is turned OFF."); // Radyo kapandığında mesaj yazdır
    }

    @Override
    public void setVolume(int volume) {
        this.volume = volume;
        System.out.println("Radio volume set to " + this.volume);
    }
}