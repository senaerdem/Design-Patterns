package com.example.bridgedesignpattern;
// Client : Pattern'in kullanıldığı ana sınıf
public class Main {
    public static void main(String[] args) {
        // TV ve Radyo cihazlarının oluşturulması
        Device tv = new TV();
        Device radio = new Radio();

        // Kumandaların oluşturulması
        RemoteControl tvRemote = new RemoteControl(tv) {};
        AdvancedRemoteControl radioRemote = new AdvancedRemoteControl(radio);

        // TV kontrol işlemleri
        tvRemote.turnOn();
        tvRemote.setVolume(15);
        tvRemote.turnOff();

        // Radio kontrol işlemleri
        radioRemote.turnOn();
        radioRemote.setVolume(10);
        radioRemote.mute();
        radioRemote.turnOff();
    }
}