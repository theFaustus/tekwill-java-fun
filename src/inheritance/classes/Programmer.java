package inheritance.classes;

import java.util.Arrays;

public class Programmer extends Employee {
    private String[] programmingLanguages;

    public void writeCode() {
        System.out.println("Writing clean code!");
    }

    public void debugCode() {
        System.out.println("Debugging code!");
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "facebookId='" + facebookId + '\'' +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", experience=" + experience +
                ", programmingLanguages=" + Arrays.toString(programmingLanguages) +
                '}';
    }
}
