package com.example.adapterdesignpattern;

class BankBAdapter implements PaymentProcessor {
    private BankB bankB;

    public BankBAdapter(BankB bankB) {
        this.bankB = bankB;
    }

    @Override
    public void processPayment(String cardNumber, String cardHolderName, double amount) {
        bankB.payUsingCard(cardHolderName, cardNumber, amount);
    }
}
