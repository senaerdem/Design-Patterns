package com.example.adapterdesignpattern;
class BankA {
    public void makePayment(String cardNumber, double amount) {
        System.out.println("Payment processed via Bank A: " + amount + " for card: " + cardNumber);
    }
}
