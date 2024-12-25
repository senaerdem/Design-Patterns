package com.example.observerdesignpattern;

public class Main {
    public static void main(String[] args) {
        // İki ürün oluşturulur
        Product laptop = new Product("Laptop");
        Product phone = new Product("Phone");

        // İki farklı abonelik türü oluşturulur
        Subscriber emailSubscriber = new EmailNotification("senanurerdem@gmail.com");
        Subscriber smsSubscriber = new SMSNotification("+905555555555");

        // Aboneler ürünlere eklenir
        laptop.addSubscriber(emailSubscriber);
        laptop.addSubscriber(smsSubscriber);

        phone.addSubscriber(emailSubscriber);

        // Ürün stok durumu güncellenir (Bu, abonelere bildirim gönderir)
        laptop.setAvailability(true);
        phone.setAvailability(true);

        // Bir abone bir üründen kaldırılır
        laptop.removeSubscriber(smsSubscriber);

        // Ürün stok durumu tekrar güncellenir
        laptop.setAvailability(false);
    }
}