package io.reading;

import java.util.Scanner;

public class KeyboardReader {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // initialization

        System.out.println("Please enter a number > ");
        int integerReadFromKeyboard = scanner.nextInt(); // reading an int. Applicable for almost every type
        System.out.println("You entered " + integerReadFromKeyboard);

        System.out.println("Please now enter a String > ");
        scanner.nextLine(); //skip the last enter - very important when dealing with multiple inputs
        String stringReadFromKeyboard = scanner.nextLine(); // reading a String

        System.out.println("You entered " + stringReadFromKeyboard);
    }
}
