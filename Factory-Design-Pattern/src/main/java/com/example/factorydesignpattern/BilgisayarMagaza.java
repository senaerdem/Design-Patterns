package com.example.factorydesignpattern;

public class BilgisayarMagaza {
    public static void main(String[] args) {
        Bilgisayar lenovo = BilgisayarFactory.getBilgisayar("lenovo", "8 GB", 13);

        Bilgisayar casper = BilgisayarFactory.getBilgisayar("casper", "15 GB", 16);

        System.out.println("Lenovo bilgisayar özellikleri: ");
        System.out.println(lenovo);

        System.out.println("Casper bilgisayar özellikleri: ");
        System.out.println(casper);
    }
}
