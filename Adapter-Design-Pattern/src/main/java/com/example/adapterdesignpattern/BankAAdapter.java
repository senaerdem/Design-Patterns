package com.example.adapterdesignpattern;

class BankAAdapter implements PaymentProcessor {
    private BankA bankA;

    public BankAAdapter(BankA bankA) {
        this.bankA = bankA;
    }

    @Override
    public void processPayment(String cardNumber, String cardHolderName, double amount) {
        bankA.makePayment(cardNumber, amount);
    }
}
