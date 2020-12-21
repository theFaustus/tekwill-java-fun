package datatypes.operators.arithmetic;

import java.util.Scanner;

public class InchesToFeetAndInchesConverter {

    public static final int INCHES_IN_ONE_FOOT = 12;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your height in inches : ");
        int heightInInches = scanner.nextInt();

        //1ft = 12in

        System.out.println("Feet = " + heightInInches / INCHES_IN_ONE_FOOT);
        System.out.println("Inches = " + heightInInches % INCHES_IN_ONE_FOOT);

//        //57
//        int feet = heightInInches / 12; // 4
//        int remainingInches = heightInInches - (feet * 12); // 57 - 48 = 9
//
//        System.out.println(feet + " " + remainingInches);

        SphereVolumeCalculator.computeVolume(10);

    }
}
