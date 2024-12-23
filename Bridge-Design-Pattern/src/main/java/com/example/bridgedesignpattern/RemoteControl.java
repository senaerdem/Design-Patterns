package com.example.bridgedesignpattern;
// Abstraction : Cihazları kontrol etmek için genel bir kumanda tanımı
abstract class RemoteControl {
    protected Device device; // Kontrol edilecek cihaz

    // Constructor: Kumandaya hangi cihazın kontrol edileceği belirtilir
    protected RemoteControl(Device device) {
        this.device = device;
    }

    // Cihazı aç
    public void turnOn() {
        device.turnOn(); // Kontrol edilen cihazın turnOn metodu çağrılır
    }

    // Cihazı kapat
    public void turnOff() {
        device.turnOff(); // Kontrol edilen cihazın turnOff metodu çağrılır
    }

    // Ses seviyesini ayarla
    public void setVolume(int volume) {
        device.setVolume(volume); // Kontrol edilen cihazın setVolume metodu çağrılır
    }
}