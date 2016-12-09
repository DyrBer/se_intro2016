public class Main {
    public static void main(String[] args) {
        final Vector v1 = new Vector();
        final Vector v2 = new Vector();
        v1.add(1);
        v1.add(2);
        v1.add(3);

        v2.add(3);
        v2.add(2);
        v2.add(1);

        Vector v3 = VectorOperation.sum(v1, v2);
        Vector v4 = VectorOperation.div(v1, v2);
        Vector v5 = VectorOperation.incr(v1, 5);
        double result = VectorOperation.nor(v1);
        double result1 = VectorOperation.skalar(v1, v2);



        System.out.println("Размер массива: " + v1.size());

        System.out.println("Второй элемент массива : " + v1.get(1));

        System.out.print("Сумма: ");
        for (int i = 0; i < v1.size(); i++) {
            System.out.print(v3.get(i) + " ");
        }
        System.out.println();

        System.out.print("Разность: ");
        for (int i = 0; i < v1.size(); i++) {
            System.out.print(v4.get(i) + " ");
        }
        System.out.println();

        System.out.print("Умножение на константу: ");
        for (int i = 0; i < v1.size(); i++) {
            System.out.print(v5.get(i) + " ");
        }
        System.out.println();


        System.out.print("Норма: ");
        System.out.println(result);

        System.out.print("Скалярное произведение: ");
        System.out.println(result1);
    }
}
