package com.example.mementodesignpattern;
// Memento sınıfı: Siparişin durumunu saklar.
class OrderState {
    private final String status; // Siparişin durumu (immutable).

    // Constructor, sipariş durumunu ayarlar.
    public OrderState(String status) {
        this.status = status;
    }

    // Sipariş durumunu döner.
    public String getStatus() {
        return status;
    }
}
