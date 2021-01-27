package javaapi.arrays;

import java.util.Scanner;

public class RomanToNumerals {
    static boolean correctInput = true;

    static int convertRomanNumerals(String roman) {
        int result = 0;
        for (int i = 0; i < roman.length(); i++) {
            if (!isValidRoman(roman.charAt(i))) {
                System.out.println("Wrong input!!!!");
                break;
            }

            if (i + 1 < roman.length() && adjacentRomanNeedSubtracting(roman.charAt(i), roman.charAt(i + 1))) {
                result += (romanToInt(roman.charAt(i + 1)) - romanToInt(roman.charAt(i)));
                i++;  // 2 characters parsed
            } else {
                result += romanToInt(roman.charAt(i));
            }
        }
        return result;
    }

    private static boolean isValidRoman(char c) {
        return c == 'I' || c == 'V' || c == 'X' || c == 'L' || c == 'C' || c == 'D' || c == 'M';
    }

    private static boolean adjacentRomanNeedSubtracting(char a, char b) {
        return ((a == 'I' && (b == 'V' || b == 'X')) || (a == 'X' && (b == 'L' || b == 'C')) || (a == 'C' && (b == 'D' || b == 'M')));
    }

    public static int romanToInt(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a roman numeral:");
        String input = scanner.next();
        System.out.println(convertRomanNumerals(input));

    }
}
