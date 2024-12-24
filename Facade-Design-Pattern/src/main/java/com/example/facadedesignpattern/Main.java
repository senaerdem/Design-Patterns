package com.example.facadedesignpattern;
public class Main {
    public static void main(String[] args) {
        BankServiceFacade bankService = new BankServiceFacade();

        // Kullanıcı, facade aracılığıyla para çekme işlemi yapıyor
        bankService.withdrawMoney("12345", "password", 200.0); // Başarılı işlem
        System.out.println();

        bankService.withdrawMoney("12345", "wrongpassword", 200.0); // Hesap doğrulama başarısız
        System.out.println();

        bankService.withdrawMoney("12345", "password", 1000.0); // Yetersiz bakiye
    }
}