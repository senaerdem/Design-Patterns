package com.example.decoratordesignpattern;
// ConcreteComponent: Temel İnternet Planı (50 Mbps)
public class BasicPlan implements InternetPlan {
    @Override
    public double cost() {
        return 200.0; // Temel planın fiyatı
    }

    @Override
    public String description() {
        return "Basic Plan (50 Mbps)"; // Temel planın açıklaması
    }
}