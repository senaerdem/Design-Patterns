package com.example.mementodesignpattern;
// Originator sınıfı: Sipariş durumunu yönetir ve durumu kaydedip geri yükler.
class Order {
    private String status; // Siparişin mevcut durumu.

    // Siparişin durumunu ayarlar.
    public void setStatus(String status) {
        this.status = status;
    }

    // Siparişin mevcut durumunu döner.
    public String getStatus() {
        return status;
    }

    // Mevcut durumu bir Memento (OrderState) nesnesine kaydeder.
    public OrderState saveState() {
        return new OrderState(status);
    }

    // Daha önce kaydedilmiş bir Memento nesnesinden durumu geri yükler.
    public void restoreState(OrderState state) {
        this.status = state.getStatus();
    }
}