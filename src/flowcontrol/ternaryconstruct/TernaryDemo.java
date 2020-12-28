package flowcontrol.ternaryconstruct;

public class TernaryDemo {
    public static void main(String[] args) {

        String studentName = "Mike";
        int grade = 9;

        //without ternary
        if (studentName.equals("Mike")) {
            grade = 10;
        } else {
            grade = 8;
        }

        //using ternary
        grade = studentName.equals("Mike") ? 10 : 8;
        grade = (studentName.equals("Mike") && grade > 8) ? 10 : 8;
        int grade2 = studentName.equals("Mike") ? 10 : 8;
        int highestGrade = 10;
        int lowestGrade = 2;
        int grade3 = studentName.equals("Mike") ? highestGrade - 1 : lowestGrade + 4;

        //won`t compile
        //studentName.equals("Mike") ? highestGrade - 1  : lowestGrade + 4;
        //studentName.equals("Mike") ? highestGrade - 1  : ;
        //studentName.equals("Mike") ? highestGrade - 1;


    }
}
