package com.example.statedesignpattern;
// ConcreteState - WithdrawMoney : Para çekme durumu
class WithdrawMoneyState implements ATMState {
    @Override
    public void insertCard(ATM context) {
        System.out.println("Transaction in progress. Cannot insert another card."); // İşlem sırasında başka kart takılamaz
    }

    @Override
    public void ejectCard(ATM context) {
        System.out.println("Transaction in progress. Cannot eject card."); // İşlem sırasında kart çıkarılamaz
    }

    @Override
    public void enterPin(ATM context, int pin) {
        System.out.println("Transaction in progress. PIN entry is not allowed."); // İşlem sırasında PIN girilemez
    }

    @Override
    public void withdrawMoney(ATM context, int amount) {
        if (amount > 0) {
            System.out.println("Withdrew " + amount + "₺" + ". Please take your card.");
            context.setState(new NoCardState()); // İşlem tamamlandıktan sonra durumu NoCardState olarak değiştir
        } else {
            System.out.println("Invalid amount. Try again."); // Geçersiz miktar kontrolü
        }
    }
}