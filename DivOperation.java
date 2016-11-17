public class DivOperation extends BinaryOperation {
    public DivOperation(Expression value, Expression value1) {
        super(value,value1);
    }

    protected double doCalculate(Expression e, Expression e1) {
        double p = value.calculate();
        double p1 = value1.calculate();
        if (p1 != 0) {
            return p/p1;
        } else {
            System.out.println("error");
            return 00;
        }

    }
    protected String doString(Expression e, Expression e1){
        return (value + " / " + value1);
    }

}
