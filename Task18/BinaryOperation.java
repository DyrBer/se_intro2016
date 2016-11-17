
 public abstract class BinaryOperation implements Expression {
    protected Expression value;
    protected Expression value1;

    public BinaryOperation (Expression value, Expression value1) {
        this.value = value;
        this.value1 = value1;
    }

    public double calculate(){
        return doCalculate(value, value1);
    }
    protected abstract double doCalculate(Expression e, Expression e1);

    public String toString() {
        return doString(value, value1);
    }
    protected abstract String doString(Expression e, Expression e1);


}
