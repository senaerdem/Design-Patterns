package com.example.mementodesignpattern;
public class Main {
    public static void main(String[] args) {
        // Sipariş (Originator) ve geçmiş (Caretaker) nesneleri oluşturulur.
        Order order = new Order();
        OrderHistory history = new OrderHistory();

        // Siparişin ilk durumu ayarlanır ve kaydedilir.
        order.setStatus("Sipariş Alındı");
        System.out.println("Durum: " + order.getStatus()); // "Sipariş Alındı"
        history.save(order.saveState());

        // Siparişin durumu değiştirilir ve yeni durum kaydedilir.
        order.setStatus("Hazırlanıyor");
        System.out.println("Durum: " + order.getStatus()); // "Hazırlanıyor"
        history.save(order.saveState());

        // Siparişin durumu tekrar değiştirilir ve kaydedilir.
        order.setStatus("Yolda");
        System.out.println("Durum: " + order.getStatus()); // "Yolda"
        history.save(order.saveState());

        // Siparişin durumu teslim edildi olarak güncellenir (son durum).
        order.setStatus("Teslim Edildi");
        System.out.println("Durum: " + order.getStatus()); // "Teslim Edildi"

        // Geri alma işlemleri yapılır.
        order.restoreState(history.undo());
        System.out.println("Geri alındı: " + order.getStatus()); // "Yolda"

        order.restoreState(history.undo());
        System.out.println("Geri alındı: " + order.getStatus()); // "Hazırlanıyor"

        order.restoreState(history.undo());
        System.out.println("Geri alındı: " + order.getStatus()); // "Sipariş Alındı"
    }
}