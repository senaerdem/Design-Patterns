package com.example.adapterdesignpattern;
import java.util.HashMap;
import java.util.Map;

public class ECommercePlatform {
    private Map<String, PaymentProcessor> paymentProcessors = new HashMap<>();

    public void addBank(String bankName, PaymentProcessor processor) {
        paymentProcessors.put(bankName, processor);
    }

    public void processPayment(String bankName, String cardNumber, String cardHolderName, double amount) {
        PaymentProcessor processor = paymentProcessors.get(bankName);

        if (processor == null) {
            System.out.println("Bank " + bankName + " is not supported.");
            return;
        }

        processor.processPayment(cardNumber, cardHolderName, amount);
    }

    public static void main(String[] args) {
        // Banka API'leri
        BankA bankA = new BankA();
        BankB bankB = new BankB();
        BankC bankC = new BankC();

        // Adaptörler
        PaymentProcessor bankAAdapter = new BankAAdapter(bankA);
        PaymentProcessor bankBAdapter = new BankBAdapter(bankB);
        PaymentProcessor bankCAdapter = new BankCAdapter(bankC);

        // E-ticaret platformu
        ECommercePlatform platform = new ECommercePlatform();
        platform.addBank("Bank A", bankAAdapter);
        platform.addBank("Bank B", bankBAdapter);
        platform.addBank("Bank C", bankCAdapter);

        // Ödeme işlemleri
        System.out.println("Processing payments...");
        platform.processPayment("Bank A", "1111-2222-3333-4444", "Sena Nur Erdem", 250.75);
        platform.processPayment("Bank B", "5555-6666-7777-8888", "Melike Çakmak", 120.50);
        platform.processPayment("Bank C", "9999-0000-1111-2222", "Beyza Yüksel", 500.00);
        platform.processPayment("Unknown Bank", "1234-5678-9012-3456", "Görkem Yeter", 100.00);
    }
}
