package javaapi.arrays;

import basics.interfaces.example.Developer;
import basics.interfaces.example.Policeman;
import basics.interfaces.example.Runner;
import methods.building.Employee;

import java.util.Arrays;

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
//        wordsToSplittedArray[0] = new String[4];
//        wordsToSplittedArray[1] = new String[6];
//        wordsToSplittedArray[2] = new String[3];
//        //...
//        wordsToSplittedArray[4] = new String[2];

        //2. initialization
        intArray[0] = 4;
        intArray[4] = -5;
        intArray[1] = 9;
        intArray[2] = 6;
//        intArray[3] = 0; already 0
//        intArray[9]= 8; will throw exception
//        intArray[-5] = 5;  will throw exception

        stringArray[0] = "dog";
        stringArray[1] = "kitty";
        stringArray[2] = "bird";
        stringArray[3] = "penguin";
        stringArray[4] = "mouse";

//better use for when same value


//        for (int i = 0; i < stringArray.length; i++) {
//            System.out.println(stringArray[i]);
//            stringArray[i] = "dog - " + i;
//        }

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

//        wordsToSplittedArray
//        String[] split = "".split("");

        for (int i = 0; i < stringArray.length; i++) {
            //i = 0 , dog
            String[] splitCharacters = stringArray[i].split("");
            wordsToSplittedArray[i] = splitCharacters;
        }

        for (int i = 0; i < stringArray.length; i++) {
            //i = 0 , dog
            for (int j = 0; j < stringArray[i].length(); j++) {
                System.out.println(stringArray[i].charAt(j));
            }
        }

        for (int i = 0; i < wordsToSplittedArray.length; i++) {
//            Arrays.sort(wordsToSplittedArray[i]); if you want them sorted
            System.out.println(Arrays.toString(wordsToSplittedArray[i]));
        }


        //***. combining all of them

        //1, 2, 3, 4, 5
        int[] intArr = new int[]{1, 2, 3, 4, 5};
        //2.2, 3, 4.0
        double[] doubleArr = new double[]{2.2, 3, 4.0};
        //"word", "animal", "dog"
        String[] stringArr = new String[]{"dog", "kitty", "penguin"};
        //"Employee(...)", "Employee(...)", "Employee(...)"
        Employee[] employeeArr = new Employee[]{new Employee("Mike"), new Employee("Bob"), new Employee("Peter", 34)};

        //"word", "animal", "dog", "bob"
        // "word" -> "w", "o", "r", "d"
        // "animal" -> "a", "n", "i", "m" ...
        // ...
        String[][] wordsToSplittedArr = new String[][]{
                {"a", "b", "c"},
                {"x", "y", "z"}
        };

        //1 0 2
        //0 1 0
        //1 1 1
        int[][] matrixArr = new int[][]{
                {1, 0, 2},
                {0, 1, 0},
                {1, 1, 1}
        };

        int[][] matrixArr2 = new int[][]{
                {1, 0, 2, 4},
                {0, 1, 0, 7, 9, 15},
                {1, 1,},
                {1, 1, 5, -1}
        };


        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(doubleArr));
        System.out.println(Arrays.toString(stringArr));
        System.out.println(Arrays.toString(employeeArr));

        System.out.println();

        for (String[] s : wordsToSplittedArr)
            System.out.println(Arrays.toString(s));

        System.out.println();

        for (int[] ia : matrixArr)
            System.out.println(Arrays.toString(ia));

        System.out.println();

        for (int[] ia : matrixArr2)
            System.out.println(Arrays.toString(ia));


        //array from inheritance/interfaces

        Policeman[] policemen = new Policeman[]{};
        for (Policeman policeman : policemen) {
            policeman.run();
        }

        Developer[] developers = new Developer[]{};
        for (Developer developer : developers) {
            developer.run();
        }

        Runner[] runners = new Runner[]{new Policeman(), new Developer()};
        for (Runner runner : runners) {
            runner.run();
        }

        Object[] objectRunners = new Object[]{new Policeman(), new Developer()};
        for (Object objectRunner : objectRunners) {
            if (objectRunner instanceof Policeman)
                ((Policeman) objectRunner).doPoliceWork();
            else if (objectRunner instanceof Developer)
                ((Developer) objectRunner).run();
        }


    }

    public static int getEmployeeSize() {
        return 3;
    }
}
