package io.writing;

public class ConsolePrinter {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in); // initialization

        System.out.println("Just random playing : ");
//        System.out.println("Please enter a number > ");
//        int integerReadFromKeyboard = scanner.nextInt(); // reading an int. Applicable for almost every type
        int integerReadFromKeyboard = 1578978;
        int anotherIntegerReadFromKeyboard = -78921;
//        System.out.println("You entered " + integerReadFromKeyboard + " such a great number. Bravo!");
        System.out.printf("You entered %d, such a great number. Bravo!\n", integerReadFromKeyboard); // - %d - conversion char

//        System.out.println("Please enter a double > ");
//        double doubleReadFromKeyboard = scanner.nextDouble();
        double doubleReadFromKeyboard = 1.5468743524;
        System.out.printf("Now you entered %d and %.6f\n", integerReadFromKeyboard, doubleReadFromKeyboard); // - %f - conversion char
        System.out.printf("%d%.6f\n", integerReadFromKeyboard, doubleReadFromKeyboard); // using precision .6
        System.out.printf("%10d%14f\n", integerReadFromKeyboard, doubleReadFromKeyboard); // using width 10 and 14
        System.out.printf("%10d%14.6f\n", integerReadFromKeyboard, doubleReadFromKeyboard); // using width 10 and 14, and precision .6
        System.out.println();
        System.out.printf("%-+,16d%-+,16.6f%-+,16d\n", integerReadFromKeyboard, doubleReadFromKeyboard, anotherIntegerReadFromKeyboard); //used - for left justify and + for showing sign and , for splitting numbers
        System.out.printf("%-+,16d%-+,16.6f%-+,16d\n", integerReadFromKeyboard, doubleReadFromKeyboard, anotherIntegerReadFromKeyboard);
        System.out.printf("%-+,16d%-+,16.6f%-+,16d\n", integerReadFromKeyboard, doubleReadFromKeyboard, anotherIntegerReadFromKeyboard);
        System.out.printf("%-+,16d%-+,16.6f%-+,16d\n", integerReadFromKeyboard, doubleReadFromKeyboard, anotherIntegerReadFromKeyboard);
        System.out.printf("%3$-+,16d%2$-+,16.6f%1$-+,16d\n", integerReadFromKeyboard, doubleReadFromKeyboard, anotherIntegerReadFromKeyboard); //switch positions with argument position flag 1$, 2$, 3$

        System.out.println();
        System.out.println("Printing some booleans (conversion char = %b) :");
        boolean falseBoolean = false;
        boolean trueBoolean = true;
        String trueBooleanString = "nanana"; //defaults to true with %b
        String falseBooleanString = null; //defaults to false with %b
        System.out.printf("%b %b %b %b\n", falseBoolean, trueBoolean, falseBooleanString, trueBooleanString);

        System.out.println();
        System.out.println("Printing some chars (conversion char = %c) :");
        char a = 'a';
        char b = 65;
        char c = '\u007b';
        System.out.printf("%c %c %c\n", a, b, c);

        System.out.println();
        System.out.println("Printing some floating point numbers (conversion char = %f) : ");
        float x = 1.48f;
        float y = 52.78f;
        double z = 97.8435;
        System.out.printf("%-15f %10f %.2f\n", x, y, z);

        System.out.println();
        System.out.println("Printing some integer numbers (conversion char = %d) : ");
        byte i = 2;
        short j = 851;
        int k = 7843;
        long l = 8765137352168L;
        System.out.printf("%-15d %10d %,2d %+-15d\n", i, j, k, l);

        System.out.println();
        System.out.println("Printing some strings (conversion char = %s) : ");
        String s1 = "Hey";
        String s2 = "Nannaney";
        System.out.printf("%-20s %-20s\n", s1, s2);
        System.out.printf("%-20s %-20s\n", s1, s2);
        System.out.printf("%-20s %-20s\n", s1, s2);
        System.out.printf("%-20s %-20s\n", s1, s2);

        System.out.println("");
        System.out.printf("%s%20s\n", "X", "X");
        System.out.printf("%s%20s\n", "X", "X");
        System.out.printf("%s%20s\n", "X", "X");
        System.out.printf("%s%20s\n", "X", "X");
        System.out.printf("%s%20s\n", "X", "X");
        System.out.printf("%s%20s\n", "X", "X");
        System.out.printf("%s%s%20s\n", "X", "XXXXXX", "X");

        //DecimalFormat decimalFormat = new DecimalFormat(); //for a more custom formatting
        //System.out.println("Please now enter a String > ");
        //scanner.nextLine(); //skip the last enter - very important when dealing with multiple inputs
        //String stringReadFromKeyboard = scanner.nextLine(); // reading a String

//        System.out.println("You entered " + stringReadFromKeyboard);

    }
}
