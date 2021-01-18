package methods;

import methods.building.Employee;

public class PassTypeInMethod {

    public static void main(String[] args) {
        int x = 5;
        Employee e = new Employee();

        System.out.println(x);
        System.out.println(e);

        add(x);
        change(e);

        System.out.println(x);
        System.out.println(e);
    }

    //remember Java is pass-by-value
    public static void add(int a) {
        a += 5;
    }

    //remember Java is pass-by-value
    public static void change(Employee e) {
        e = new Employee("Bob");
    }
}
