package methods;

public class DivisorsFinder {
    public static void printNumbersDivisibleBy5and6(int start, int end) {
        int numberOfDivisors = 0;
        for (int i = start; i <= end; i++) {
            if (i % 5 == 0 && i % 6 == 0) {
                System.out.print(i + " ");
                numberOfDivisors++;
                if (numberOfDivisors % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }

    public static void printNumbersDivisibleBy(int start, int end, int divisor) {
        int numberOfDivisors = 0;
        for (int i = start; i <= end; i++) {
            if (i % divisor == 0) {
                System.out.print(i + " ");
                numberOfDivisors++;
                if (numberOfDivisors % 10 == 0) {
                    System.out.println();
                }
            }
        }
    }

    public static int[] findNumbersDivisibleBy(int start, int end, int... divisor) {
        int numberOfDivisors = 0;
        for (int i = start; i <= end; i++) {
//            if(i % divisor == 0){
//                System.out.print(i + " ");
//                numberOfDivisors++;
//                if (numberOfDivisors % 10 == 0) {
//                    System.out.println();
//                }
//            }
        }
        return null;
    }

    public static void main(String[] args) {
        DivisorsFinder.printNumbersDivisibleBy5and6(100, 1000);
        DivisorsFinder.printNumbersDivisibleBy(100, 1000, 5);
        DivisorsFinder.printNumbersDivisibleBy(100, 1000, 6);
        DivisorsFinder.printNumbersDivisibleBy(100, 1000, 15);
    }
}
