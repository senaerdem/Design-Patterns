package com.example.chainofresponsibilitydesignpattern;
// Abstract Handler: Ortak davranışları tanımlayan soyut sınıf
abstract class EmailHandler {
    // Zincirde bir sonraki handler
    protected EmailHandler nextHandler;

    // Zincire bir sonraki handlerı eklemek için metot
    public void setNextHandler(EmailHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // E-posta işleme için abstract metot
    public abstract void handleEmail(String sender, String subject);
}