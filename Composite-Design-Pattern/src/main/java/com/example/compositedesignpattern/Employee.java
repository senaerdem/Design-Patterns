package com.example.compositedesignpattern;

// Base Component Arayüzü : Tüm çalışan türleri bu arayüzü uygular.
interface Employee {
    void showDetails(); // Çalışan detaylarını göstermek için ortak bir metod.
}