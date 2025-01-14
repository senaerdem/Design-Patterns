package com.example.interpreterdesignpattern;
// Non-Terminal Expression: AND işlemini gerçekleştiren sınıf.
class AndExpression implements BooleanExpression {
    private final BooleanExpression leftExpression; // Sol operand
    private final BooleanExpression rightExpression; // Sağ operand

    public AndExpression(BooleanExpression leftExpression, BooleanExpression rightExpression) {
        this.leftExpression = leftExpression;
        this.rightExpression = rightExpression;
    }

    @Override
    public boolean interpret() {
        // İki operand arasında AND işlemi yapar.
        return leftExpression.interpret() && rightExpression.interpret();
    }
}
