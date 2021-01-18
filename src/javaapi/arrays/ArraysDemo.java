package javaapi.arrays;

import methods.building.Employee;

public class ArraysDemo {
    public static void main(String[] args) {
        String letters = "abcdef"; //behind the scenes String stores this as a char[] = {'a', 'b'...}
        int a = 0;
        for (int i = 0; i < letters.length(); i++) {
            System.out.println(letters.charAt(i));
        }


        //1. declaration

        //1, 2, 3, 4, 5
        int[] intArray; //by default references null
        //2.2, 3, 4.0
        double[] doubleArray;
        //"word", "animal", "dog"
        String[] stringArray; //by default references null
        //"Employee(...)", "Employee(...)", "Employee(...)"
        Employee[] employeeArray; //by default references null

        //"word", "animal", "dog", "bob"
        // "word" -> "w", "o", "r", "d"
        // "animal" -> "a", "n", "i", "m" ...
        // ...
        String[][] wordsToSplittedArray;  //by default references null

        //1 0 2
        //0 1 0
        //1 1 1
        int[][] matrix; // references null

        //2. allocation
        int x = 5;
        intArray = new int[x]; //using a variable
        stringArray = new String[5];
        employeeArray = new Employee[getEmployeeSize()]; //usign a method
//        matrix = new int[3][];
        matrix = new int[3][3];
        doubleArray = new double[10];

        wordsToSplittedArray = new String[stringArray.length][];
        wordsToSplittedArray[0] = new String[4];
        wordsToSplittedArray[1] = new String[6];
        wordsToSplittedArray[2] = new String[3];
        //...
        wordsToSplittedArray[4] = new String[2];

        //2. initialization
        intArray[0] = 4;
        intArray[4] = -5;
        intArray[1] = 9;
        intArray[2] = 6;
//        intArray[3] = 0; already 0
//        intArray[9]= 8; will throw exception
//        intArray[-5] = 5;  will throw exception

//        stringArray[0] = "dog";
//        stringArray[1] = "dog";
//        stringArray[2] = "dog";
//        stringArray[3] = "dog";
//        stringArray[4] = "dog";
//        better use for


        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
            stringArray[i] = "dog - " + i;
        }

        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }

        for (int i = 0; i < doubleArray.length; i++) {
            doubleArray[i] = Math.sqrt(i);
        }

        //printing in ascending by index
        for (int i = 0; i < doubleArray.length; i++) {
            System.out.println(doubleArray[i]);
        }

        //printing in descending by index
        for (int i = doubleArray.length - 1; i >= 0; i--) {
            System.out.println(doubleArray[i]);
        }


        //initializing 2-dimensional array
        //        //1 0 2
        //        //0 1 0
        //        //1 1 1
        matrix[0][0] = 1;
        matrix[0][1] = 0;
        matrix[0][2] = 1;

        matrix[1][0] = 4;
        matrix[1][1] = 1;
        matrix[1][2] = 5;

        matrix[2][0] = 1;
        matrix[2][1] = 9;
        matrix[2][2] = 7;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i * j;
            }
        }
        System.out.println();

//        for (int i = 0; i < matrix.length; i++) {
//            for (int j = 0; j < 3; j++) { //better use the length of the array
//                System.out.print(matrix[i][j] + " ");
//            }
//            System.out.println();
//        }

        for (int[] array : matrix) {
            for (int element : array) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

        stringArray[0] = null;
        System.out.println(stringArray.length);
        for (String s : stringArray) {
            System.out.println(s);
        }

        stringArray[0] = "dog - 666";
        System.out.println(stringArray.length);
        for (String s : stringArray) {
            System.out.println(s);
        }


    }

    public static int getEmployeeSize() {
        return 3;
    }
}
