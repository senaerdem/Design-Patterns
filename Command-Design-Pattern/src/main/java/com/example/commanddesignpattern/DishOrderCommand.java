package com.example.commanddesignpattern;
// ConcreteCommand - Yemek siparişi için
class DishOrderCommand implements Command {
    private Chef chef;
    private String dish;

    public DishOrderCommand(Chef chef, String dish) {
        this.chef = chef;
        this.dish = dish;
    }

    @Override
    public void execute() {
        chef.cookDish(dish); // Yemek hazırlanıyor
    }

    @Override
    public void undo() {
        chef.cancelDish(dish); // Yemek siparişi iptal ediliyor
    }

    public String getDish() {
        return dish; // Yemek adını döndürür
    }
}
