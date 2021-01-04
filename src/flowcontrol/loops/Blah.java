package flowcontrol.loops;

import java.util.Scanner;

public class Blah {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numbers = 0;
        int totalNegativ = 0;
        int totalPositiv = 0;
        double total = 0;
        boolean running = true;
        int number = -1;

        while (number != 0) {
            System.out.println("Enter a integer number");
            number = scanner.nextInt();
            if (number >= 0)
                totalPositiv++;
            else
                totalNegativ++;
            total += number;
            numbers++;
        }
        double averageOfNumbers = total / numbers;
        System.out.println("The number of positive is " + totalPositiv +
                "\nThe number of negatives is " + totalNegativ +
                "\nThe total is total " + total +
                "\nThe average is " + averageOfNumbers);
    }
}

