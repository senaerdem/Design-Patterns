package com.example.commanddesignpattern;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

// Invoker(Çağırıcı sınıf) - Garson
class Waiter {
    private List<Command> orderHistory = new ArrayList<>(); // Sipariş geçmişi
    private Stack<Command> undoStack = new Stack<>();       // Geri almak için stack
    private Stack<Command> redoStack = new Stack<>();       // Yeniden sipariş için stack

    // Yeni sipariş alma
    public void takeOrder(Command command) {
        orderHistory.add(command); // Sipariş geçmişine eklenir
        undoStack.push(command);   // Undo stack'ine eklenir
        redoStack.clear();         // Yeni bir sipariş alındığında redo geçmişi temizlenir
        System.out.println("Sipariş alındı: " + ((DishOrderCommand) command).getDish());
    }

    // Tüm siparişleri yürütme
    public void placeOrders() {
        for (Command command : orderHistory) {
            command.execute(); // Sipariş hazırlanır
        }
        orderHistory.clear(); // Geçmiş temizlenir
    }

    // Son siparişi geri alma
    public void undoLastOrder() {
        if (!undoStack.isEmpty()) {
            Command lastCommand = undoStack.pop(); // Undo stack'inden çıkar
            lastCommand.undo();                   // Komut geri alınır
            redoStack.push(lastCommand);          // Redo stack'ine eklenir
        } else {
            System.out.println("Geri alınacak sipariş yok.");
        }
    }

    // Son geri alınan siparişi yeniden yapma
    public void redoLastOrder() {
        if (!redoStack.isEmpty()) {
            Command lastCommand = redoStack.pop(); // Redo stack'inden çıkar
            lastCommand.execute();                // Komut tekrar gerçekleştirilir
            undoStack.push(lastCommand);          // Undo stack'ine eklenir
        } else {
            System.out.println("Yeniden yapılacak sipariş yok.");
        }
    }
}