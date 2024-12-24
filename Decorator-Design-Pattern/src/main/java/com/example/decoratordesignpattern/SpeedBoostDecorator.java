package com.example.decoratordesignpattern;
// ConcreteDecorator: Hız Artırma eklemek
public class SpeedBoostDecorator extends InternetPlanDecorator {
    public SpeedBoostDecorator(InternetPlan plan) {
        super(plan);
    }

    @Override
    public double cost() {
        return decoratedPlan.cost() + 40.0; // Hız artırma maliyeti, örneğin 40 TL daha ekler
    }

    @Override
    public String description() {
        return decoratedPlan.description() + " + Speed Boost (100 Mbps)"; // Hız artırımı ekler
    }
}
