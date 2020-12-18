package datatypes.operators.arithmetic;

import java.util.Scanner;

public class LatitudeToDecimalConverter {

    public static final double ARC_TO_MINUTE = 60.0;
    public static final double ARC_TO_SECONDS = 3600.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the latitude degrees : ");
        int degrees = scanner.nextInt();
        System.out.println("Enter the latitude minutes : ");
        int minutes = scanner.nextInt();
        System.out.println("Enter the latitude seconds : ");
        int seconds = scanner.nextInt();

        //DD = d + (min/60) + (sec/3600)
        double result = degrees + (minutes / ARC_TO_MINUTE) + (seconds / (ARC_TO_SECONDS));

        System.out.printf("Result = %.4f", result);
    }
}
