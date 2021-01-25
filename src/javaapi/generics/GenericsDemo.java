package javaapi.generics;

import java.util.ArrayList;
import java.util.List;

public class GenericsDemo {
    public static void main(String[] args) {

        List listOfStrings = new ArrayList();
        listOfStrings.add("A");
        listOfStrings.add("B");
        listOfStrings.add("C");
        listOfStrings.add("D");
        listOfStrings.add("E");
        listOfStrings.add(new Integer(46));

        for (int i = 0; i < listOfStrings.size(); i++) {
            System.out.println(((String) listOfStrings.get(i)).toLowerCase());
        }

        List<String> listOfStrings2 = new ArrayList<>();
        listOfStrings2.add("A");
        listOfStrings2.add("B");
        listOfStrings2.add("C");
        listOfStrings2.add("D");
        listOfStrings2.add("E");
//        listOfStrings2.add(new Integer(46)); failing-fast


        for (int i = 0; i < listOfStrings2.size(); i++) {
            System.out.println(listOfStrings2.get(i).toLowerCase());
        }


    }
}
