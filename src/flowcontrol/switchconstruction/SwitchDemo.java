package flowcontrol.switchconstruction;

import datatypes.types.enums.Planet;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a decimal number between 0 and 15 :");
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


        if (decimalNumber < 0 || decimalNumber > 15) {
            System.out.println(decimalNumber + " is an invalid input");
        } else {
            switch (decimalNumber) {
                case 10:
                    System.out.println("A");
                    break;
                case 11:
                    System.out.println("B");
                    break;
                case 12:
                    System.out.println("C");
                    break;
                case 13:
                    System.out.println("D");
                    break;
                case 14:
                    System.out.println("E");
                    break;
                case 15:
                    System.out.println("F");
                    break;
                default:
                    System.out.println(decimalNumber);
                    break;

            }
        }

        scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        switch (dayOfWeek) {
            case "MON":
            case "TUE":
            case "WED":
            case "THU":
            case "FRI":
                System.out.println("Working day!");
                break;
            case "SUN":
            case "SAT":
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Not a day!");

        }


        String planetString = scanner.nextLine();
        Planet planet = Planet.valueOf(planetString);

        switch (planet) {
            case MARS:
                System.out.println("Still not home!");
            case VENUS:
                System.out.println("Yes, not home!");
            case PLUTO:
                System.out.println("Not home!");
                break;
            case TERRA:
                System.out.println("Home!");
                break;
            default:
                System.out.println("Not a planet!");

        }

        System.out.println("Out of switch");
    }
}
