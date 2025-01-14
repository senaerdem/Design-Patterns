package com.example.mediatordesignpattern;
import java.util.ArrayList;
import java.util.List;
// Concrete Mediator
class ChatRoom implements ChatMediator {
    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void sendMessage(String message, User sender, User receiver) {
        // Belirli bir kullanıcıya mesaj gönderme
        if (users.contains(receiver)) {
            receiver.receive(message, sender);
        } else {
            System.out.println("Mesaj gönderilemedi: Kullanıcı bulunamadı.");
        }
    }

    @Override
    public void broadcastMessage(String message, User sender) {
        // Tüm kullanıcılara mesaj gönderme
        for (User user : users) {
            if (user != sender) { // Mesajı gönderen kullanıcıya tekrar göndermiyoruz
                user.receive(message, sender);
            }
        }
    }

    @Override
    public void addUser(User user) {
        this.users.add(user);
    }
}