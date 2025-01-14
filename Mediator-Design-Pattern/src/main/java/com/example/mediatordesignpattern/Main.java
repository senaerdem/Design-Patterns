package com.example.mediatordesignpattern;

public class Main {
    public static void main(String[] args) {
        // Mediator (Chat Room) oluşturuluyor
        ChatMediator chatRoom = new ChatRoom();

        // Kullanıcılar oluşturuluyor
        User admin = new AdminUser(chatRoom, "Admin");
        User user1 = new StandardUser(chatRoom, "Ahmet");
        User user2 = new StandardUser(chatRoom, "Mehmet");
        User user3 = new StandardUser(chatRoom, "Ayşe");

        // Kullanıcılar Chat Room'a ekleniyor
        chatRoom.addUser(admin);
        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        // Admin herkese mesaj gönderiyor
        admin.sendToAll("Herkese selamlar! Chat odasına hoş geldiniz.");

        // Kullanıcılar birbirine özel mesaj gönderiyor
        user1.sendToUser("Merhaba Mehmet, nasılsın?", user2);

        // Kullanıcılar herkese mesaj gönderiyor
        user3.sendToAll("Herkese günaydın!");

        // Admin, Ahmet'e özel mesaj gönderiyor
        admin.sendToUser("Ahmet, lütfen kurallara dikkat et.", user1);
    }
}