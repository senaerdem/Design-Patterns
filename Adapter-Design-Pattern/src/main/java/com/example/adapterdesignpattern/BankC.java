package com.example.adapterdesignpattern;

class BankC {
    public void executeTransaction(double amount, String cardDetails) {
        System.out.println("Payment processed via Bank C: " + amount + " for card details: " + cardDetails);
    }
}
