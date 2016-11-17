 public class MinOperation extends BinaryOperation {
    public MinOperation(Expression value, Expression value1) {
        super(value,value1);
    }

    protected double doCalculate(Expression e, Expression e1) {
        double p = value.calculate();
        double p1 = value1.calculate();
        return p - p1 ;

    }
    protected String doString(Expression e, Expression e1){
        return ("(" + value + " - " + value1 + ")");
    }

}
