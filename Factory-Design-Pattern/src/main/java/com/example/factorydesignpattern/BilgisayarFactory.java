package com.example.factorydesignpattern;

public class BilgisayarFactory {

    public static Bilgisayar getBilgisayar(String model, String ram, int boyut) {
        Bilgisayar bilgisayar;
        if ("Lenovo".equalsIgnoreCase(model)) {
            bilgisayar = new Lenovo(model, ram, boyut);
        }
        else if("Casper".equalsIgnoreCase(model)) {
            bilgisayar = new Casper(model, ram, boyut);
        }
        else {
            throw new RuntimeException("Geçerli bir model değildir");
        }
        return bilgisayar;
    }
}
