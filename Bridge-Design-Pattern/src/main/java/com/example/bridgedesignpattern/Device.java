package com.example.bridgedesignpattern;

// Implementor : Cihazların ortak davranışlarını tanımlayan arayüz
interface Device {
    void turnOn(); // Cihazı az
    void turnOff(); // Cihazı kapat
    void setVolume(int volume); // Ses seviyesini ayarla
}