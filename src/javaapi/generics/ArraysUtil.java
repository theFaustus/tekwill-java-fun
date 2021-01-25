package javaapi.generics;

public class ArraysUtil {
    private int lengthOfElements;

    public static <E> void printArrayCommaSeparated(E[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1)
                System.out.print(array[i] + ", ");
            else
                System.out.print(array[i]);
        }
        System.out.println("]");
    }

    public static <E> void printArraySpaceSeparated(E[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1)
                System.out.print(array[i] + " ");
            else
                System.out.print(array[i]);
        }
        System.out.println("]");
    }

    public static <E> void printArrayColonSeparated(E[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i != array.length - 1)
                System.out.print(array[i] + " : ");
            else
                System.out.print(array[i]);
        }
        System.out.println("]");
    }
}
