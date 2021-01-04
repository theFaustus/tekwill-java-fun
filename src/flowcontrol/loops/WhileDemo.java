package flowcontrol.loops;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
        boolean needMoreBurgers = true;
        int numberOfBurgers = 15;
        int currentNumberOfBurgers = 0;

        int y = 1;
        do {
//            System.out.print(y + " ");
//            y = y + 1;
            System.out.println(y++ + " ");
        } while (y <= 10);
        System.out.println();

        while (needMoreBurgers) {
            System.out.println("Preparing burger #" + currentNumberOfBurgers);
            currentNumberOfBurgers++;

            if (numberOfBurgers == currentNumberOfBurgers) {
                needMoreBurgers = false;
            }
        }

        Scanner scanner = new Scanner(System.in);
        boolean exitCommandNotSelected = true;
        do {
            System.out.println("Welcome to the menu : ");
            System.out.println("[1] Funny quote");
            System.out.println("[2] Joke");
            System.out.println("[3] Trivia");
            System.out.println("[#] Exit");

            String s = scanner.nextLine();

            switch (s) {
                case "1":
                    System.out.println("Funny!");
                    break;
                case "2":
                    System.out.println("Here is a joke!");
                    break;
                case "3":
                    System.out.println("Here is a trivia fact!");
                    break;
                case "#":
                    System.out.println("Bye, bye!");
                    exitCommandNotSelected = false;
                    break;
                default:
                    System.out.println("Please enter a correct option or (#) to exit");
            }

        } while (exitCommandNotSelected);

    }


}
