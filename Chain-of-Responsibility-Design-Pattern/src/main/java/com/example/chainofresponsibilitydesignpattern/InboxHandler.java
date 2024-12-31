package com.example.chainofresponsibilitydesignpattern;
// Varsayılan İşleyici: Gelen Kutusu
class InboxHandler extends EmailHandler {
    @Override
    public void handleEmail(String sender, String subject) {
        // Eğer diğer filtreler işleyemiyorsa, e-posta gelen kutusuna taşınır
        System.out.println("Gelen Kutusu: E-posta 'Gelen Kutusu'na taşındı. Gönderen: " + sender);
    }
}