package javaapi.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapsDemo {
    public static void main(String[] args) {
        Map<String, String> dex = new HashMap<>();
        dex.put("masa", "ceva din lemn pe care mananci");
        dex.put("scaun", "ceva din lemn pe care te asezi");
        dex.put("farfurie", "ceva din care mananci");

        System.out.println(dex);

        for (String wordDefinition : dex.values()) {
            System.out.println(wordDefinition);
        }

        for (String word : dex.keySet()) {
            System.out.println(word);
        }

        for (Map.Entry<String, String> wordToDefinition : dex.entrySet()) {
            System.out.println(wordToDefinition);
            if (wordToDefinition.getKey().equals("masa"))
                System.out.println("+");
            if (wordToDefinition.getValue().equals("ceva din care mananci"))
                System.out.println("-");
        }

        System.out.println(dex.get("masa"));

        dex.remove("masa");

        System.out.println(dex);

        Map<Character, String> alpha = new TreeMap<>();
        alpha.put('B', "second letter");
        alpha.put('C', "third letter");
        alpha.put('A', "first letter");
        alpha.put('D', "fourth letter");

        System.out.println(alpha);
    }
}
