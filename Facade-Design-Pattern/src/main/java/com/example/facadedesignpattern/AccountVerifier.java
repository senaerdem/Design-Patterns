package com.example.facadedesignpattern;
// Alt Sistem :  Bankanın farklı işlevlerini temsil eder
class AccountVerifier {
    public boolean verifyAccount(String accountNumber, String password) {
        // Basit doğrulama simülasyonu
        if ("12345".equals(accountNumber) && "password".equals(password)) {
            System.out.println("Hesap doğrulandı.");
            return true;
        } else {
            System.out.println("Hesap doğrulama başarısız.");
            return false;
        }
    }
}

