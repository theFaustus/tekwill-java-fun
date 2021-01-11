package methods;

public class Calculator {

    public static double add(double a, double b) {
        double result = 0;
        result = a + b;
        return result;
    }

    //overloading - for the sake of example
    public static double add(String a, String b) {
        return Integer.parseInt(a) + Integer.parseInt(b);
    }

    public static long add(long a, long b) {
        return a + b;
    }

    public static long add(long... values) {
        long sumOfValues = 0;
        for (int i = 0; i < values.length; i++) {
            sumOfValues += values[i];
        }
        return sumOfValues;
    }

    static double add(long a, String b) {
        return a + Integer.parseInt(b);
    }

    static double add(String b, long a) {
        return a + Integer.parseInt(b);
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double square(double a) {
//        return multiply(a, a);
        return Math.pow(a, 2);
    }

    public static double sqrt(double b) {
        if (b < 0) {
            return 0; //last to execute
        }
        return Math.sqrt(b); //last to execute
    }

    public static double average(double... values) {
        //0 1 2 3 4
        //| | | | |
        //4 9 7 3 1
        double sumOfValues = 0;
        for (int i = 0; i < values.length; i++) {
            sumOfValues += values[i];
        }
        return sumOfValues / values.length;
    }

    public static void printMultiplicationTable(double a) {
        if (a < 0) {
            System.out.println("Please use with a positive number");
            return;
        }

        for (int i = 0; i <= 9; i++) {
            System.out.println(a + " x " + i + " = " + i * a);
//            for (int j = 0; j < 5; j++) {
//                if(j == 2 && i == 4){
//                    return; //for the sake of example
//                }
//            }
        }

    }

}
