package datatypes.operators.arithmetic;

import java.util.Scanner;

public class SumOfDigitsCalculator {
    private int number;

    private int hundreds;
    private int tens;
    private int units;

    private int sumOfDigits;

    public SumOfDigitsCalculator(int number) {
        this.number = number;
        hundreds = number / 100;
        tens = (number % 100) / 10;
        units = (number % 100) % 10;
        sumOfDigits = hundreds + tens + units;
    }

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number between 0 and 1000: ");
        int number = scanner.nextInt();

        System.out.println("The Sum of digits is: " + new SumOfDigitsCalculator(number));
    }

    @Override
    public String toString() {
        return "SumOfDigitsCalculator{" +
                "number=" + number +
                ", hundreds=" + hundreds +
                ", tens=" + tens +
                ", units=" + units +
                ", sumOfDigits=" + sumOfDigits +
                '}';
    }

    public int getSumOfDigits() {
        return sumOfDigits;
    }
}
