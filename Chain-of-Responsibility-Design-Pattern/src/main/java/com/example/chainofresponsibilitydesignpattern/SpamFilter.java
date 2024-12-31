package com.example.chainofresponsibilitydesignpattern;
// Concrete Handler 1: Spam Filtresi
class SpamFilter extends EmailHandler {
    @Override
    public void handleEmail(String sender, String subject) {
        // Eğer konu spam içeriyorsa işlem burada sonlanır
        if (subject.toLowerCase().contains("win money") || subject.toLowerCase().contains("lottery")) {
            System.out.println("Spam Filtresi: E-posta spam olarak reddedildi. Gönderen: " + sender);
        } else if (nextHandler != null) {
            // Zincirde bir sonraki işleyiciye yönlendir
            nextHandler.handleEmail(sender, subject);
        }
    }
}