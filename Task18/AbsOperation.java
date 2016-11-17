public class AbsOperation extends UnaryOperation {


    public AbsOperation(Expression value) {
        super(value);
    }

    public double calculate() {
        return doCalculate(value);
    }

    protected double doCalculate(Expression e) {
        double p = value.calculate();
        if (p >= 0) {
            return p;
        } else {
            return (-p);
        }
    }
    protected String doString(Expression e){
        return ("|" + value.calculate() + "|");
    }


}
