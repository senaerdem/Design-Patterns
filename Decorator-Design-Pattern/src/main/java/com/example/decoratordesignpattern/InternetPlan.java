package com.example.decoratordesignpattern;

// Component: Temel İnternet Planı
public interface InternetPlan {
    double cost(); // İnternet planının maliyetini döndürür
    String description(); // İnternet planının açıklamasını döndürür
}