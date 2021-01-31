package javaapi.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//import java.util.HashSet;
//import java.util.Set;
//import java.util.TreeSet;

//import java.util.ArrayList;
//import java.util.HashSet;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Set;
//import java.util.TreeSet;

public class SetsDemo {
    public static void main(String[] args) {
        Set<String> setOfColors = new HashSet<>();

        setOfColors.add("Red");
        setOfColors.add("Red");
        setOfColors.add("Red");
        setOfColors.add("Yellow");
        setOfColors.add("Green");
        setOfColors.add("Blue");
        setOfColors.add("Blue");

        System.out.println();
        for (String color : setOfColors) {
            System.out.println(color);
//            System.out.println(color.toUpperCase());
//            System.out.println(color.toLowerCase());
        }

//        Iterator<String> iterator = setOfColors.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        System.out.println(setOfColors.contains("Red"));
        System.out.println(setOfColors.contains("Yellow"));

        //sorted
        Set<Character> alphabet = new TreeSet<>();
        alphabet.add('B');
        alphabet.add('B');
        alphabet.add('B');
        alphabet.add('D');
        alphabet.add('A');
        alphabet.add('A');
        alphabet.add('A');
        alphabet.add('C');
        alphabet.add('C');

        for (Character character : alphabet) {

            System.out.println(character);
        }

    }
}
