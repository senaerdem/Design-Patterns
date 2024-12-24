package com.example.decoratordesignpattern;
public class Main {
    public static void main(String[] args) {
        // Temel internet planı
        InternetPlan plan = new BasicPlan();
        System.out.println(plan.description());
        System.out.println("Cost: ₺" + plan.cost());

        // Hız artırma ekle
        plan = new SpeedBoostDecorator(plan);
        System.out.println(plan.description());
        System.out.println("Cost with speed boost: ₺" + plan.cost());

        // Ekstra veri paketi ekle
        plan = new ExtraDataDecorator(plan);
        System.out.println(plan.description());
        System.out.println("Cost with extra data: ₺" + plan.cost());
    }
}