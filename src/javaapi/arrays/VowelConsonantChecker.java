package javaapi.arrays;

import javaapi.generics.ArraysUtil;

import java.util.Arrays;

public class VowelConsonantChecker {
    public static void main(String[] args) {
        String s = "Programming is fun";
        String s1 = "Programming is fun.!";
        String s2 = "Programming is fun...";

        System.out.println(Arrays.toString(countVowelsAndConsonants(s)));
        System.out.println(Arrays.toString(countVowelsAndConsonants(s1)));
        System.out.println(Arrays.toString(countVowelsAndConsonants(s2)));
        printVowelsAndConsonants(countVowelsAndConsonants(s2));
        int[] ints = countVowelsAndConsonants(s2);
        Integer[] ints2 = new Integer[]{ints[0], ints[1]};
        String[] strings = new String[]{"sdf", "SDF", "Sdf"};
        ArraysUtil.printArrayCommaSeparated(ints2);
        ArraysUtil.printArrayCommaSeparated(strings);
        ArraysUtil.printArraySpaceSeparated(strings);
        ArraysUtil.printArrayColonSeparated(strings);
        ArraysUtil.printArrayColonSeparated(ints2);
    }

    private static int[] countVowelsAndConsonants(String s) {
        int[] numberOfVowelsAndConsonants = new int[2];
        for (int i = 0; i < s.length(); i++) {
            if (Character.isAlphabetic(s.charAt(i)) && isVowel(s.charAt(i)))
                numberOfVowelsAndConsonants[0]++;
            else if (Character.isAlphabetic(s.charAt(i)))
                numberOfVowelsAndConsonants[1]++;
        }
        return numberOfVowelsAndConsonants;
    }

    public static boolean isVowel(char c) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        for (int i = 0; i < vowels.length; i++) {
            if (vowels[i] == c)
                return true;
        }
        return false;
    }

    public static void printVowelsAndConsonants(int[] ints) {
        for (int i = 0; i < ints.length; i++) {
            System.out.println(ints[i]);
        }
    }
}
