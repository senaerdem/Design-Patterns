package com.example.interpreterdesignpattern;

public class Main {
    public static void main(String[] args) {

        // Çözülmesini istediğimiz ifade
        String expression = "true false OR true AND"; // (true OR false) AND true

        // İfade çözülerek bir Expression nesnesi oluşturulur.
        BooleanExpression parsedExpression = BooleanInterpreter.parseExpression(expression);

        // Sonuç yorumlanır ve ekrana yazdırılır.
        System.out.println("Sonuç: " + parsedExpression.interpret()); // Sonuç: true
    }
}