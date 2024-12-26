package com.example.statedesignpattern;
// ConcreteState - HasCard : Kartın takılı olduğu durum
class HasCardState implements ATMState {
    @Override
    public void insertCard(ATM context) {
        System.out.println("Card is already inserted."); // Zaten kart takılıysa uyarı ver
    }

    @Override
    public void ejectCard(ATM context) {
        System.out.println("Card ejected.");
        context.setState(new NoCardState()); // Durumu NoCardState olarak değiştir
    }

    @Override
    public void enterPin(ATM context, int pin) {
        if (pin == 1234) { // Doğru PIN kontrolü
            System.out.println("PIN accepted. You can withdraw money now.");
            context.setState(new WithdrawMoneyState()); // Durumu WithdrawMoneyState olarak değiştir
        } else {
            System.out.println("Incorrect PIN. Try again."); // Yanlış PIN girdisi
        }
    }

    @Override
    public void withdrawMoney(ATM context, int amount) {
        System.out.println("Please enter your PIN first."); // PIN girilmeden para çekilemez
    }
}