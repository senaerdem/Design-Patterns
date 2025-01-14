package com.example.interpreterdesignpattern;
// Non-Terminal Expression: OR işlemini gerçekleştiren sınıf.
class OrExpression implements BooleanExpression {
    private final BooleanExpression leftExpression; // Sol operand
    private final BooleanExpression rightExpression; // Sağ operand

    public OrExpression(BooleanExpression leftExpression, BooleanExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public boolean interpret() {
        // İki operand arasında OR işlemi yapar.
        return leftExpression.interpret() || rightExpression.interpret();
    }
}