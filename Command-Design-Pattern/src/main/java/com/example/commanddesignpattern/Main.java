package com.example.commanddesignpattern;
public class Main {
    public static void main(String[] args) {
        Chef chef = new Chef();

        // Farklı yemek sipariş komutları oluşturulur
        Command pizzaOrder = new DishOrderCommand(chef, "Pizza");
        Command pastaOrder = new DishOrderCommand(chef, "Pasta");
        Command saladOrder = new DishOrderCommand(chef, "Salata");

        Waiter waiter = new Waiter();

        // Garson sipariş alır
        waiter.takeOrder(pizzaOrder);
        waiter.takeOrder(pastaOrder);
        waiter.takeOrder(saladOrder);

        // Tüm siparişler hazırlanır
        System.out.println("\nTüm siparişler hazırlanıyor:");
        waiter.placeOrders();

        // Son sipariş geri alınır
        System.out.println("\nSon sipariş geri alınıyor:");
        waiter.undoLastOrder();

        // Son geri alınan sipariş yeniden yapılır
        System.out.println("\nSon sipariş yeniden yapılıyor:");
        waiter.redoLastOrder();

        // Tüm siparişler geri alınır
        System.out.println("\nTüm siparişler geri alınıyor:");
        waiter.undoLastOrder();
        waiter.undoLastOrder();
        waiter.undoLastOrder();

        // Geri alınan siparişler yeniden yapılır
        System.out.println("\nTüm siparişler yeniden yapılıyor:");
        waiter.redoLastOrder();
        waiter.redoLastOrder();
        waiter.redoLastOrder();
    }
}