public abstract class UnaryOperation implements Expression {
    protected Expression value;

    public UnaryOperation(Expression value) {

        this.value = value;
    }

    public double calculate() {
        return doCalculate(value);
    }
    public String toString() {
        return doString(value);
    }
    protected abstract double doCalculate(Expression e);
    protected abstract String doString(Expression e);

}
