package flowcontrol.loops;

import datatypes.types.enums.Planet;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForDemo {
    public static void main(String[] args) {
        int tableOf = 25;

        for (int i = 0; i <= 5; i++) {
            System.out.println("i=" + i + " * tableOf=" + tableOf + " is equal " + i * tableOf);
        }

        System.out.println();
        int ctr = 12;
        for (int j = 10, k = 14; j <= k; ++j, k = k - 1, ctr--) {
            System.out.println(j + " " + k + " " + ctr);
        }

        for (int i = 0, j = 5, k = 1000; i < 5 && k < 10002; i++, k += 500, j--, printMethod()) {
            System.out.println("i=" + i + ", j=" + j + ", k=" + k);
        }

        //missing initialization block
        int numberOfIterations = 0;
        for (; numberOfIterations < 5; numberOfIterations++) {
            System.out.println(numberOfIterations);
        }

        //missing update clause block
        for (int i = 0; i < 5; ) {
            System.out.println(i);
            i++;
        }

        //missing terminal condition block - CAREFULLY CAUSING INFINITE LOOP IF NOT USED PROPERLY
//        for(int i = 0; ; i++){
//            System.out.println(i);
//        }

        //nested fors
        for (int hrs = 1; hrs < 5; hrs++) {
            for (int minutes = 1; minutes < 60; minutes++) {
                for (int seconds = 1; seconds < 60; seconds++) {
                    System.out.println("Current time : " + hrs + ":" + minutes + ":" + seconds);
                }
//                System.out.println("      " + minutes + " : A minute passed");
            }
//            System.out.println(hrs + " : An hour passed");
        }

        //nested fors
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println();
        //nested fors
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        System.out.println();

        //nested fors
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k < 10; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();


        //nested fors
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("  ");
            }
            for (int k = i; k < 10; k++) {
                System.out.print(" *");
            }
            for (int k = i; k < 9; k++) {
                System.out.print(" *");
            }
            System.out.println();
        }
        System.out.println();

        List<String> stringsList = new ArrayList<>();
        stringsList.add("Mike");
        stringsList.add("John");
        stringsList.add("Bob");

        //traditional for using indexes
        for (int i = 0; i < stringsList.size(); i++) {
            System.out.println(stringsList.get(i));
        }

        //traditional for using iterator
        for (Iterator<String> iterator = stringsList.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }

        //enhanced for loop
        for (String element : stringsList) {
            System.out.println(element);
        }

        //enhanced for loop
        for (Planet planet : Planet.values()) {
            System.out.println(planet);
        }

        System.out.println();
        List<String> exams = new ArrayList<>();
        exams.add("OCA");
        exams.add("OCP");
        List<String> levels = new ArrayList<>();
        levels.add("Basic");
        levels.add("Advanced");
        List<String> grades = new ArrayList<>();
        grades.add("Pass");
        grades.add("Fail");

        for (String exam : exams) {
            for (String level : levels) {
                for (String grade : grades) {
                    System.out.println(exam + " - " + level + " - " + grade);
                }
            }
        }
    }

    private static void printMethod() {
        System.out.println("End of iteration...");
    }
}
