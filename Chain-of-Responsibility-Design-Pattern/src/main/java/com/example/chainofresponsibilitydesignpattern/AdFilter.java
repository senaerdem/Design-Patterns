package com.example.chainofresponsibilitydesignpattern;
// Concrete Handler 2: Reklam Filtresi
class AdFilter extends EmailHandler {
    @Override
    public void handleEmail(String sender, String subject) {
        // Eğer konu reklam içeriyorsa e-posta reklamlar klasörüne taşınır
        if (subject.toLowerCase().contains("sale") || subject.toLowerCase().contains("discount")) {
            System.out.println("Reklam Filtresi: E-posta 'Reklamlar' klasörüne taşındı. Gönderen: " + sender);
        } else if (nextHandler != null) {
            // Zincirde bir sonraki handlera yönlendir
            nextHandler.handleEmail(sender, subject);
        }
    }
}