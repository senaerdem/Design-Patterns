package com.example.decoratordesignpattern;
// Decorator: İnternet Planı dekoratörü
public abstract class InternetPlanDecorator implements InternetPlan {
    protected InternetPlan decoratedPlan; // Decorate yapılmış internet planını temsil eden nesne

    public InternetPlanDecorator(InternetPlan plan) {
        this.decoratedPlan = plan;
    }

    public double cost() {
        return decoratedPlan.cost(); // Decorate yapılmış planın maliyetini döndürür
    }

    public String description() {
        return decoratedPlan.description(); // Decorate yapılmış planın açıklamasını döndürür
    }
}
