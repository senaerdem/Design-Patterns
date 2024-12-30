package com.example.commanddesignpattern;
// Receiver Class(Alıcı sınıf) - Şef
class Chef {
    public void cookDish(String dish) {
        System.out.println("Şef " + dish + " hazırlıyor.");
    }

    public void cancelDish(String dish) {
        System.out.println("Şef " + dish + " siparişini iptal etti.");
    }
}