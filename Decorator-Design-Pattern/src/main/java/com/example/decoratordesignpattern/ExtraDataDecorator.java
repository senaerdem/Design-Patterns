package com.example.decoratordesignpattern;
// ConcreteDecorator: Ekstra Veri Paketi eklemek
public class ExtraDataDecorator extends InternetPlanDecorator {
    public ExtraDataDecorator(InternetPlan plan) {
        super(plan);
    }

    @Override
    public double cost() {
        return decoratedPlan.cost() + 30.0; // Ekstra veri paketi maliyeti, örneğin 30 tl daha ekler
    }

    @Override
    public String description() {
        return decoratedPlan.description() + " + Extra Data (10 GB)"; // Ekstra veri paketini ekler
    }
}
