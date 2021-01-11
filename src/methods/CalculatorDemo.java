package methods;

public class CalculatorDemo {
    public static void main(String[] args) {
        System.out.println(Calculator.add(3545, 345));
        System.out.println(Calculator.multiply(4, 40));
        System.out.println(Calculator.square(4));
        Calculator.printMultiplicationTable(5);
        Calculator.printMultiplicationTable(-5);
        System.out.println(Calculator.average(new double[]{4, 5, 7, 8, 9}));
        System.out.println(Calculator.average(1, 2));
        System.out.println(Calculator.average(1));
        System.out.println(Calculator.average(1, 4, 6, 7, 9));
        System.out.println(Calculator.average());

        //overloading
        System.out.println(Calculator.add(789L, 546L));
        System.out.println(Calculator.add("4", "67"));
        System.out.println(Calculator.add(34.0, 45.0));
        System.out.println(Calculator.add(34L, "4"));
        System.out.println(Calculator.add("4", 34L));
        System.out.println(Calculator.add(34L));
    }
}
