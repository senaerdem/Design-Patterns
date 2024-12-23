package com.example.bridgedesignpattern;
// RefinedAbstraction : Kumandaya ek özellikler ekleyen gelişmiş sınıf
class AdvancedRemoteControl extends RemoteControl {

    // Constructor: Hangi cihazın kontrol edileceği belirtilir
    protected AdvancedRemoteControl(Device device) {
        super(device);
    }

    // Cihazı sessize al
    public void mute() {
        System.out.println("Device is muted."); // Sessize alma işlemi mesajı
        device.setVolume(0); // Ses seviyesini 0'a ayarla
    }
}