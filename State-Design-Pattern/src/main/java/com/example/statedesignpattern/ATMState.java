package com.example.statedesignpattern;
// State Interface
// ATM'nin farklı durumlarını (kart takılı, kart yok, PIN girildi vb.) temsil eden arayüz.
// Her durum, ATM'nin o anda gerçekleştirebileceği işlemleri tanımlar.
interface ATMState {
    void insertCard(ATM context); // Kart takma işlemi
    void ejectCard(ATM context); // Kart çıkarma işlemi
    void enterPin(ATM context, int pin); // PIN girme işlemi
    void withdrawMoney(ATM context, int amount); // Para çekme işlemi
}
