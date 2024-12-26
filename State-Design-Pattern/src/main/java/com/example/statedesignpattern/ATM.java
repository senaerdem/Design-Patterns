package com.example.statedesignpattern;
// Context - ATM : Durumları yöneten sınıf
class ATM {
    private ATMState state;

    public ATM() {
        // Varsayılan olarak kart yok durumunda başlar
        state = new NoCardState();
    }

    public void setState(ATMState state) {
        this.state = state;
    }

    public void insertCard() {
        state.insertCard(this); // Kart takma işlemi
    }

    public void ejectCard() {
        state.ejectCard(this); // Kart çıkarma işlemi
    }

    public void enterPin(int pin) {
        state.enterPin(this, pin); // Pin girme işlemi
    }

    public void withdrawMoney(int amount) {
        state.withdrawMoney(this, amount); // Para çekme işlemi
    }
}