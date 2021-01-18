package methods.building;

import methods.Puppy;

public class Employee {
    private static String office;

    static { //executes once per entire class
        System.out.println("Static life of employee is being created... 0");
        office = "Main-Office";
    }

    static { //executes once per entire class
        System.out.println("Static life of employee is being created... 1");
        office = "Main-Office";
    }

    static { //executes once per entire class
        System.out.println("Static life of employee is being created... 2");
        office = "Main-Office";
    }

// Carefully not a constructor - simply a method with the same name as the class
//
//    void Employee(String name, int age, Department department){
//        this.setName(name);
//        this.setAge(age);
//        this.department = department;
//    }
//
//    public String Employee(String name, int age, Department department){
//        this.setName(name);
//        this.setAge(age);
//        this.department = department;
//
//    }

    private String name = "n/a";
    private int age;
    private Department department;
    private Puppy puppy;

    { //executes per object
        System.out.println("Employee is being born... 0");
    }

    { //executes per object
        System.out.println("Employee is being born... 1");
    }

    { //executes per object
        System.out.println("Employee is being born... 2");
    }

    //Constructor overloading in action
    public Employee(String name, int age, Department department) {
        System.out.println("Initializing employee via constructor...");
        this.setName(name);
        this.setAge(age);
        this.department = department;

    }

    //not using this
    public Employee(String name, int age) {
        System.out.println("Initializing employee via constructor...");
        this.setName(name);
        this.setAge(age);
        this.department = Department.SOFTWARE;
    }

    //using this
    public Employee(String name) {
        this(name, 30, Department.SOFTWARE);
    }

    //this
    public Employee() {
        this("n/a");
    }

    public String takeNotes(String notes, String paper) {
        focus();
        paper += notes;
        return paper;
    }

    public Phone takeNotes(String notes, Phone phone) {
        focus();
        phone.setNotes(notes);
        return phone;
    }

    public Computer takeNotes(String notes, Computer computer) {
        focus();
        computer.setNotes(notes);
        return computer;
    }

    private void focus() {
        System.out.println("Focusing...");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && !name.isEmpty())
            this.name = "Mr." + name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 99)
            this.age = age;
        else
            this.age = 30;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department=" + department +
                ", puppy=" + puppy +
                '}';
    }
}
