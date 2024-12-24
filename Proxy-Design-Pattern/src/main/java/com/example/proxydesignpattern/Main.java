package com.example.proxydesignpattern;
public class Main {
    public static void main(String[] args) {
        File file = new FileProxy(); // Proxy nesnesi oluşturuluyor

        // Kullanıcı rolü "USER"
        System.out.println("Attempting to delete file as USER:");
        file.delete("USER");
        System.out.println();

        // Kullanıcı rolü "ADMIN"
        System.out.println("Attempting to delete file as ADMIN:");
        file.delete("ADMIN");
    }
}