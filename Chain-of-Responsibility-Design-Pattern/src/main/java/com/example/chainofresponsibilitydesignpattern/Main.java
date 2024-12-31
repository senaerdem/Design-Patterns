package com.example.chainofresponsibilitydesignpattern;
public class Main {
    public static void main(String[] args) {
        // Zinciri oluştur
        EmailHandler spamFilter = new SpamFilter();
        EmailHandler adFilter = new AdFilter();
        EmailHandler internalEmailFilter = new CompanyEmailFilter();
        EmailHandler inboxHandler = new InboxHandler();

        // Handlerları birbirine bağla
        spamFilter.setNextHandler(adFilter);
        adFilter.setNextHandler(internalEmailFilter);
        internalEmailFilter.setNextHandler(inboxHandler);

        // E-posta örneklerini işle
        System.out.println("1. E-posta:");
        spamFilter.handleEmail("win@money.com", "Win money now!");

        System.out.println("\n2. E-posta:");
        spamFilter.handleEmail("boyner@shopping.com", "Big sale on bags!");

        System.out.println("\n3. E-posta:");
        spamFilter.handleEmail("seerdem@innova.com", "Quarterly Meeting Reminder");

        System.out.println("\n4. E-posta:");
        spamFilter.handleEmail("beyza@gmail.com", "Selam nasılsın?");
    }
}