package com.example.adapterdesignpattern;
class BankCAdapter implements PaymentProcessor {
    private BankC bankC;

    public BankCAdapter(BankC bankC) {
        this.bankC = bankC;
    }

    @Override
    public void processPayment(String cardNumber, String cardHolderName, double amount) {
        bankC.executeTransaction(amount, cardNumber + " (" + cardHolderName + ")");
    }
}
