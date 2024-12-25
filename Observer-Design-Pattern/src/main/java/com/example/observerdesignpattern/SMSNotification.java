package com.example.observerdesignpattern;
// Concrete Observer : SMS ile bildirim gönderen abone
class SMSNotification implements Subscriber {
    private String phoneNumber; // Abonenin telefon numarası

    // Constructor
    public SMSNotification(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void notify(String product, boolean isAvailable) {
        // SMS ile bildirim gönderimi simüle edilir
        System.out.println("SMS gönderildi (" + phoneNumber + "): " + product + " artık " + (isAvailable ? "stokta" : "stokta değil") + ".");
    }
}