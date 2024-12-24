package com.example.facadedesignpattern;
// Alt Sistem : Kullanıcının yeterli bakiye olup olmadığını kontrol eder.
class BalanceChecker {
    private double balance = 1000.0;

    // Bakiyeyi kontrol eder ve yeterliyse true, değilse false döner.
    public boolean hasSufficientBalance(double amount) {
        if (balance >= amount) {
            System.out.println("Yeterli bakiye mevcut: " + balance + " TL");
            return true;
        } else {
            System.out.println("Yetersiz bakiye. Mevcut bakiye: " + balance + " TL");
            return false;
        }
    }

    // Çekilen miktarı bakiyeden düşer
    public void deductBalance(double amount) {
        balance -= amount;
        System.out.println("Yeni bakiye: " + balance + " TL");
    }
}