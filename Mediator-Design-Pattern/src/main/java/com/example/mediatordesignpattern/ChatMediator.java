package com.example.mediatordesignpattern;
interface ChatMediator {
    void sendMessage(String message, User sender, User receiver); // Belirli bir kullanıcıya mesaj gönderme
    void broadcastMessage(String message, User sender); // Tüm kullanıcılara mesaj gönderme
    void addUser(User user);
}