package flowcontrol.ifconstruction;

import java.util.Scanner;

public class DecimalToHexConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal numbe between 0 and 15 :");
        int decimalNumber = scanner.nextInt();
//        if (decimalNumber < 0 || decimalNumber > 15) {
//            System.out.println(decimalNumber + " is an invalid input");
//        } else {
//            if (decimalNumber == 10) {
//                System.out.println("A");
//            } else if (decimalNumber == 11) {
//                System.out.println("B");
//            } else if (decimalNumber == 12) {
//                System.out.println("C");
//            } else if (decimalNumber == 13) {
//                System.out.println("D");
//            } else if (decimalNumber == 14) {
//                System.out.println("E");
//            } else if (decimalNumber == 15) {
//                System.out.println("F");
//            } else {
//                System.out.println(decimalNumber);
//            }
//        }

        //without wrappers
        System.out.println(toHexString(decimalNumber));

        //just printing
        printToHexString(decimalNumber);

        //with Integer wrapper
        System.out.println(Integer.toHexString(decimalNumber).toUpperCase());
    }

    private static String toHexString(int decimalNumber) {
        if (decimalNumber < 0 || decimalNumber > 15) {
            System.out.println(decimalNumber + " is an invalid input");
            return "ERROR";
        } else {
            if (decimalNumber == 10) {
                return "A";
            } else if (decimalNumber == 11) {
                return "B";
            } else if (decimalNumber == 12) {
                return "C";
            } else if (decimalNumber == 13) {
                return "D";
            } else if (decimalNumber == 14) {
                return "E";
            } else if (decimalNumber == 15) {
                return "F";
            } else {
                return Integer.toString(decimalNumber);
            }
        }
    }

    private static void printToHexString(int decimalNumber) {
        if (decimalNumber < 0 || decimalNumber > 15) {
            System.out.println(decimalNumber + " is an invalid input");
        } else {
            if (decimalNumber == 10) {
                System.out.println("A");
            } else if (decimalNumber == 11) {
                System.out.println("B");
            } else if (decimalNumber == 12) {
                System.out.println("C");
            } else if (decimalNumber == 13) {
                System.out.println("D");
            } else if (decimalNumber == 14) {
                System.out.println("E");
            } else if (decimalNumber == 15) {
                System.out.println("F");
            } else {
                System.out.println(decimalNumber);
            }
        }
    }
}
