package com.example.mediatordesignpattern;
// Kullanıcı Sınıfı (Colleague)
abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
    }

    // Mesaj gönderme ve alma için abstract metotlar
    public abstract void sendToAll(String message);
    public abstract void sendToUser(String message, User receiver);
    public abstract void receive(String message, User sender);
}