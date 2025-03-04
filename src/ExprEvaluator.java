package src;

public class ExprEvaluator implements ExprVisitor<Float> {

    @Override
    public Float visit(PlusExpr expr) {
        return expr.getE1().accept(this) + expr.getE2().accept(this);
    }

    @Override
    public Float visit(MinusExpr expr) {
        return expr.getE1().accept(this) - expr.getE2().accept(this);
    }

    @Override
    public Float visit(TimesExpr expr) {
        return expr.getE1().accept(this) * expr.getE2().accept(this);
    }

    @Override
    public Float visit(DivExpr expr) {
        return expr.getE1().accept(this) / expr.getE2().accept(this);
    }

    @Override
    public Float visit(FloatExpr expr) {
        return expr.literal;
    }
}
