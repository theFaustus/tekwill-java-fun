package datatypes.types;

import java.text.DecimalFormat;

public class Person {

    public static final double NEWTONIAN_CONSTANT_OF_GRAVITATION = 6.67430e-11;
    public static final String MONDAY = "Monday";

    boolean married = true;
    boolean employed = false;

    byte age = 20; //-128 to 127
    short numberOfYearsStudied = 4;//-32768 to 32767
    int numberOfDaysWorked = 2_144_654_132; //by default in java every integer literal is int
    static long numberOfSecondsSlept = 2_144_654_132_231_978_545L; //very large

    float averageTemperature = 36.6F;
    double weight = 85.5; //by default in java every floating-point literal is a double

    //6.67430(15)×10−11
//    double newtonianConstantOfGravitation = 6.67430e-11;

    char firstLetterOfFirstName = 'I';
    char firstLetterOfLastName = 25888; //65534

    int decimalInteger = 10;
    int binaryInteger = 0b010101;
    int octalInteger = 0_1214565;
    int hexadecimalInteger = 0xFFFFFF;

    public static void main(String[] args) {
        Person person = new Person();

        System.out.println("2_023");
        System.out.println(2_023);
        System.out.println(person.firstLetterOfFirstName);
        System.out.println(person.firstLetterOfLastName);
        System.out.println(new DecimalFormat("###,###").format(numberOfSecondsSlept));

        System.out.println(person);
    }

}
