package com.example.adapterdesignpattern;

interface PaymentProcessor {
    void processPayment(String cardNumber, String cardHolderName, double amount);
}
