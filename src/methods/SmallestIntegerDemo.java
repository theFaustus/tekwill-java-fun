package methods;

import java.util.Scanner;

public class SmallestIntegerDemo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of how many numbers you are going to enter : ");
        int numberOfIntegers = scanner.nextInt();
        int smallestInteger = Integer.MAX_VALUE;
        System.out.println("Start entering the integers...");
        for (int i = 0; i < numberOfIntegers; i++) {
            int currentInteger = scanner.nextInt();
            if (currentInteger < smallestInteger) {
                smallestInteger = currentInteger;
            }
        }
        System.out.println("The smallest integer is " + smallestInteger);
    }

}
