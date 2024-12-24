package com.example.facadedesignpattern;
// Facade Sınıfı :  Kullanıcıyla alt sistemler arasında bir köprü görevi görür.
class BankServiceFacade {
    private AccountVerifier accountVerifier;
    private BalanceChecker balanceChecker;
    private TransactionExecutor transactionExecutor;

    // Constructor
    public BankServiceFacade() {
        this.accountVerifier = new AccountVerifier();
        this.balanceChecker = new BalanceChecker();
        this.transactionExecutor = new TransactionExecutor();
    }

    // Tüm işlemleri sırasıyla yürütür
    public void withdrawMoney(String accountNumber, String password, double amount) {
        System.out.println("Para çekme işlemi başlatılıyor...");
        if (accountVerifier.verifyAccount(accountNumber, password)) { // Hesap doğrulama
            if (balanceChecker.hasSufficientBalance(amount)) { // Bakiye kontrolü
                balanceChecker.deductBalance(amount); // Bakiyeden düşme
                transactionExecutor.executeTransaction(amount); // İşlem gerçekleştirme
                System.out.println("İşlem tamamlandı.");
            } else {
                System.out.println("İşlem başarısız: Yetersiz bakiye.");
            }
        } else {
            System.out.println("İşlem başarısız: Hesap doğrulama hatası.");
        }
    }
}