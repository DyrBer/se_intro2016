public class SqrOperation extends UnaryOperation {
     public SqrOperation(Expression value) {
        super(value);
    }

    protected double doCalculate(Expression e) {
        double p = value.calculate();
        return p * p;
    }
    protected String doString(Expression e){
        return ("(" + value + ")^2");
    }

}
