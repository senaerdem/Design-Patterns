package com.example.interpreterdesignpattern;
import java.util.Stack;

// Context: Verilen ifadeyi analiz eden ve yorumlayan sınıf.
class BooleanInterpreter {
    public static BooleanExpression parseExpression(String input) {
        Stack<BooleanExpression> stack = new Stack<>(); // Yığın kullanılarak işlem yapılır.
        String[] tokens = input.split(" "); // İfade boşluklara göre ayrılır.

        // Tüm token'lar işlenir.
        for (String token : tokens) {
            switch (token.toUpperCase()) {
                case "AND":
                    // AND işlemi için sağ ve sol ifadeler yığından alınır.
                    BooleanExpression rightAnd = stack.pop();
                    BooleanExpression leftAnd = stack.pop();
                    // Yeni bir AND ifadesi yığına eklenir.
                    stack.push(new AndExpression(leftAnd, rightAnd));
                    break;
                case "OR":
                    // OR işlemi için sağ ve sol ifadeler yığından alınır.
                    BooleanExpression rightOr = stack.pop();
                    BooleanExpression leftOr = stack.pop();
                    // Yeni bir OR ifadesi yığına eklenir.
                    stack.push(new OrExpression(leftOr, rightOr));
                    break;
                default:
                    // Terminal ifadeler (true/false) yığına eklenir.
                    stack.push(new BooleanValue(Boolean.parseBoolean(token)));
                    break;
            }
        }

        // Sonuç olarak yığında kalan ifade döndürülür.
        return stack.pop();
    }
}