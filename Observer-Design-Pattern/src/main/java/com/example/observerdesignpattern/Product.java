package com.example.observerdesignpattern;
import java.util.*;
// Subject (Observable) class : Gözlemlenebilir nesne
class Product {
    private String name; // Ürün adı
    private boolean isAvailable; // Stok durumu
    private List<Subscriber> subscribers = new ArrayList<>(); // Abone listesi

    // Constructor - Ürün adı ile nesne oluşturulur
    public Product(String name) {
        this.name = name;
        this.isAvailable = false; // Varsayılan olarak stokta değil
    }

    // Abone ekleme yöntemi
    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    // Abone kaldırma yöntemi
    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    // Tüm abonelere stok durumu bildirimi gönderilir
    public void notifySubscribers() {
        for (Subscriber subscriber : subscribers) {
            subscriber.notify(name, isAvailable);
        }
    }

    // Ürünün stok durumu güncellenir ve aboneler bilgilendirilir
    public void setAvailability(boolean isAvailable) {
        this.isAvailable = isAvailable;
        System.out.println("Ürün " + name + " durumu güncellendi: " + (isAvailable ? "Stokta" : "Stokta değil"));
        notifySubscribers(); // Stok durumu değişikliği tüm abonelere bildirilir
    }
}