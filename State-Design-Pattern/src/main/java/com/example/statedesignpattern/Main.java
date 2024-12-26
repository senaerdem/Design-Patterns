package com.example.statedesignpattern;
// Ana sınıf - ATM'nin çalışma mantığını test eder
public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();

        atm.withdrawMoney(100); // Lütfen önce kartınızı takın.
        atm.insertCard();       // Kart takıldı. Lütfen PIN'inizi girin.
        atm.enterPin(4321);     // Yanlış PIN. Tekrar deneyin.
        atm.enterPin(1234);     // PIN kabul edildi. Artık para çekebilirsiniz.
        atm.withdrawMoney(200); // 200₺ çekildi. Lütfen kartınızı alın.
        atm.ejectCard();        // Çıkarılacak kart yok.
    }
}