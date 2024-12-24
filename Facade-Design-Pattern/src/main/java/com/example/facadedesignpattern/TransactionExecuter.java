package com.example.facadedesignpattern;
// Para çekme işlemini simüle eder.
class TransactionExecutor {
    public void executeTransaction(double amount) {
        System.out.println(amount + " TL başarıyla çekildi.");
    }
}