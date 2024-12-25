package com.example.observerdesignpattern;
// Concrete Observer : Email ile bildirim gönderen abone
class EmailNotification implements Subscriber {
    private String email; // Abonenin email adresi

    // Constructor
    public EmailNotification(String email) {
        this.email = email;
    }

    @Override
    public void notify(String product, boolean isAvailable) {
        // Email ile bildirim gönderimi simüle edilir
        System.out.println("Email gönderildi (" + email + "): " + product + " artık " + (isAvailable ? "stokta" : "stokta değil") + ".");
    }
}