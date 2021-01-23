package javaapi.arrays;

import java.util.Scanner;

public class ISBNChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the 12 digits of isbn : ");
        //978013213080
        String isbn = s.nextLine();

//        int checksum = 10 - (
//                Integer.parseInt(isbn.charAt(0) + "") + 3 * Integer.parseInt(isbn.charAt(1) + "") +
//                Integer.parseInt(isbn.charAt(2) + "") + 3 * Integer.parseInt(isbn.charAt(3) + "") +
//                Integer.parseInt(isbn.charAt(4) + "") + 3 * Integer.parseInt(isbn.charAt(5) + "") +
//                Integer.parseInt(isbn.charAt(6) + "") + 3 * Integer.parseInt(isbn.charAt(7) + "") +
//                Integer.parseInt(isbn.charAt(8) + "") + 3 * Integer.parseInt(isbn.charAt(9) + "") +
//                Integer.parseInt(isbn.charAt(10) + "") + 3 * Integer.parseInt(isbn.charAt(11) + "")) % 10;

        int sumOfDigits = 0;
        for (int i = 0; i < isbn.length(); i++) {
            int digit = Integer.parseInt(isbn.charAt(i) + "");
            if ((i + 1) % 2 == 0) {
                sumOfDigits += 3 * digit;
            } else {
                sumOfDigits += digit;
            }
        }

        int checksum = 10 - sumOfDigits % 10;
        if (checksum == 10)
            checksum = 0;
        System.out.println(isbn + checksum);
    }
}
