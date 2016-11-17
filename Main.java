public class Main {
    public static void main(String[] arg) {
        Expression test1 = new SumOperation(new MulOperation(new SumOperation(new Value(2), new Value(3)), new Value(-10)) , new SqrOperation(new Value(5)));
        Expression test2 = new SumOperation(new MulOperation(new SumOperation(new Value(2), new Value(3)), new Value(-10)) , new SqrOperation(new Value(5)));
        System.out.println(test1.toString() + " = " + test1.calculate());

    }
}
