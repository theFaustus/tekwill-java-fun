package javaapi.collections;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {

    public static void main(String[] args) {
        int[] arr = {1};
        List<String> shoppingList = new MyAwesomeList();
        shoppingList.add("Potatos");
        shoppingList.add("Tomatos");
        shoppingList.add("Toothpaste");

        System.out.println(shoppingList);

        shoppingList.add(0, "Burger");
        System.out.println(shoppingList);

        shoppingList.set(1, "Potatoes");
        System.out.println(shoppingList);

        shoppingList.addAll(Arrays.asList("Tea", "Coffee"));
        System.out.println(shoppingList);

        shoppingList.addAll(1, Arrays.asList("Sugar", "Salt"));
        System.out.println(shoppingList);

        String s = shoppingList.get(2);
        System.out.println(s);

        //displaying
        System.out.println("fori printing");
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(shoppingList.get(i));
        }

        System.out.println("enhanced for printing");
        for (String item : shoppingList) {
            System.out.println(item);
        }

        //removing
        for (int i = 0; i < shoppingList.size(); i++) {
            System.out.println(shoppingList.get(i));
            if (shoppingList.get(i).equals("Tea"))
                shoppingList.remove(i);
        }

//        for (String item : shoppingList) {
//            shoppingList.remove(item); //java.util.ConcurrentModificationException in for each loop
//            System.out.println(item);
//        }

        System.out.println("iterator printing");
        System.out.println();
        ListIterator<String> stringListIterator = shoppingList.listIterator();
        while (stringListIterator.hasNext()) {
            if (stringListIterator.next().equals("Sugar"))
                stringListIterator.remove();
        }
        System.out.println(shoppingList);

        ListIterator<String> stringListIterator2 = shoppingList.listIterator();
        while (stringListIterator2.hasNext()) {
            if (stringListIterator2.next().equals("Coffee"))
                stringListIterator2.set("Arabica Coffee");
        }
        System.out.println(shoppingList);

        shoppingList.removeAll(Arrays.asList("Burger", "Salt"));
        System.out.println(shoppingList);

//        shoppingList.removeIf(e -> e.equals("sdf"));

        List<String> shoppingListSubList = shoppingList.subList(0, 2);
        System.out.println(shoppingList);
        System.out.println(shoppingListSubList);


        shoppingList.add("Tomatos");
        System.out.println(shoppingList.indexOf("Tomatos"));
        System.out.println(shoppingList.lastIndexOf("Tomatos"));

        foo(shoppingList);
    }

    public static void foo(List<String> arrayList) {
        for (String s : arrayList) {
            System.out.println(s);
        }
    }

}
