package com.example.mediatordesignpattern;
// Concrete Colleague - Admin Kullanıcı
class AdminUser extends User {
    public AdminUser(ChatMediator mediator, String name) {
        super(mediator, name);
    }

    @Override
    public void sendToAll(String message) {
        System.out.println("Admin " + this.name + " herkese gönderdi: " + message);
        mediator.broadcastMessage(message, this);
    }

    @Override
    public void sendToUser(String message, User receiver) {
        System.out.println("Admin " + this.name + " " + receiver.name + "'a özel mesaj gönderdi: " + message);
        mediator.sendMessage(message, this, receiver);
    }

    @Override
    public void receive(String message, User sender) {
        System.out.println("Admin " + this.name + " " + sender.name + "'dan mesaj aldı: " + message);
    }
}