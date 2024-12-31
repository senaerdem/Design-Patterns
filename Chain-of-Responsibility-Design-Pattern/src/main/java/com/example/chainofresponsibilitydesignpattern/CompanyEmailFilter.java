package com.example.chainofresponsibilitydesignpattern;
// Concrete Handler 3: Şirket İçi Filtresi
class CompanyEmailFilter extends EmailHandler {
    @Override
    public void handleEmail(String sender, String subject) {
        // Eğer e-posta şirketten geliyorsa önemli klasörüne taşınır
        if (sender.endsWith("@innova.com")) {
            System.out.println("Şirket İçi Filtresi: E-posta 'Önemli' klasörüne taşındı. Gönderen: " + sender);
        } else if (nextHandler != null) {
            // Zincirde bir sonraki handlera yönlendir
            nextHandler.handleEmail(sender, subject);
        }
    }
}
