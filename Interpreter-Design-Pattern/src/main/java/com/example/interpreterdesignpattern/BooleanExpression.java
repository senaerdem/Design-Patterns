package com.example.interpreterdesignpattern;
// Abstract Expression: Ortak bir interface, tüm ifadeler bu metodu uygulamak zorunda.
interface BooleanExpression {
    boolean interpret();
}
