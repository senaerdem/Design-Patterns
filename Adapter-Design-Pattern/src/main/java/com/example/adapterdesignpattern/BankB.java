package com.example.adapterdesignpattern;

class BankB {
    public void payUsingCard(String name, String cardNumber, double amount) {
        System.out.println("Payment processed via Bank B: " + amount + " for card: " + cardNumber + " (Holder: " + name + ")");
    }
}
