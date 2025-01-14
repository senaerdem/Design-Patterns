package com.example.mementodesignpattern;
import java.util.Stack;
// Caretaker sınıfı: Sipariş durumlarının geçmişini saklar ve gerektiğinde geri döner.
class OrderHistory {
    private final Stack<OrderState> historyStack = new Stack<>(); // Durumların yığını.

    // Bir sipariş durumunu geçmişe kaydeder.
    public void save(OrderState state) {
        historyStack.push(state);
    }

    // Son kaydedilen sipariş durumunu geri döner.
    public OrderState undo() {
        if (!historyStack.isEmpty()) { // Yığın boş değilse geri alma işlemi yapılabilir.
            return historyStack.pop();
        }
        return null; // Yığın boşsa null döner (geri alınacak durum yok).
    }
}