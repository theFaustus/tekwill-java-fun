package inheritance.poly;

public class Demo {
    public static void main(String[] args) {
        Employee emp = new Employee();
        Employee emp1 = new Programmer();
        //variables are compile-time bound and stick always to the varaible reference type (left hand side)
        System.out.println(emp.name);
        System.out.println(emp1.name);
        //methods are run-time bound and stick always to the instance (object) type (right hand side)
        emp.foo();
        emp1.foo();
        //methods are run-time bound and stick always to the instance (object) type (right hand side)
        System.out.println(emp.getName());
        System.out.println(emp1.getName());

    }
}
