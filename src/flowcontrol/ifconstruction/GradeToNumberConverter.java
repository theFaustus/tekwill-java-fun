package flowcontrol.ifconstruction;

import java.util.Scanner;

public class GradeToNumberConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the grade (A,B,C,D,F) : ");
        String gradeLetter = scanner.nextLine();
        String gradeLetterUpperCased = gradeLetter.toUpperCase();

// common approach
//        if(gradeLetterUpperCased.equals("A")
//                || gradeLetterUpperCased.equals("B")
//                || gradeLetterUpperCased.equals("C")
//                || gradeLetterUpperCased.equals("D")
//                || gradeLetterUpperCased.equals("F")){
//            System.out.print("The numeric value for grade " + gradeLetterUpperCased + " is ");
//            if(gradeLetterUpperCased.equals("A")){
//                System.out.println("4");
//            } else if(gradeLetterUpperCased.equals("B")){
//                System.out.println("3");
//            } else if(gradeLetterUpperCased.equals("C")){
//                System.out.println("2");
//            } else if(gradeLetterUpperCased.equals("D")){
//                System.out.println("1");
//            } else if(gradeLetterUpperCased.equals("F")){
//                System.out.println("0");
//            }
//        } else {
//            System.out.println(gradeLetterUpperCased + " is an invalid input!");
//        }

//enum using ordinals, not a very good practice
//        if(gradeLetterUpperCased.equals("A")
//                || gradeLetterUpperCased.equals("B")
//                || gradeLetterUpperCased.equals("C")
//                || gradeLetterUpperCased.equals("D")
//                || gradeLetterUpperCased.equals("F")){
//            Grade grade = Grade.valueOf(gradeLetterUpperCased);
//            System.out.println("The numeric value for grade " + gradeLetterUpperCased + " is " + grade.ordinal());
//        } else {
//            System.out.println(gradeLetterUpperCased + " is an invalid input!");
//        }


//enum using an instance variable, much better approach, handles well scalability
        if (gradeLetterUpperCased.equals("A")
                || gradeLetterUpperCased.equals("B")
                || gradeLetterUpperCased.equals("C")
                || gradeLetterUpperCased.equals("D")
                || gradeLetterUpperCased.equals("F")) {
            Grade grade = Grade.valueOf(gradeLetterUpperCased);
            System.out.println("The numeric value for grade " + gradeLetterUpperCased + " is " + grade.numericValue);
        } else {
            System.out.println(gradeLetterUpperCased + " is an invalid input!");
        }

    }
}
