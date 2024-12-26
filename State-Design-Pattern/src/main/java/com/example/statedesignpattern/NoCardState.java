package com.example.statedesignpattern;
// ConcreteState - NoCard : Kartın takılı olmadığı durum
class NoCardState implements ATMState {
    @Override
    public void insertCard(ATM context) {
        System.out.println("Card inserted. Please enter your PIN.");
        context.setState(new HasCardState()); // Durumu HasCardState olarak değiştir
    }

    @Override
    public void ejectCard(ATM context) {
        System.out.println("No card to eject."); // Kart yoksa uyarı ver
    }

    @Override
    public void enterPin(ATM context, int pin) {
        System.out.println("Please insert your card first."); // Kart takılı değilse PIN girişi yapılamaz
    }

    @Override
    public void withdrawMoney(ATM context, int amount) {
        System.out.println("Please insert your card first.");  // Kart takılı değilse para çekilemez
    }
}
