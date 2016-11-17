public class SqrtOperation extends UnaryOperation {
    public SqrtOperation(Expression value) {
        super(value);
    }

    protected double doCalculate(Expression e) {
        double p = value.calculate();
        if (p >= 0) {
            return Math.sqrt(p);
        } else {
            System.out.println("error");
            return 00;
        }
    }
    protected String doString(Expression e){
        return ("sqrt(" + value + ")");
    }
}




