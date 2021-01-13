package methods.building;

public class Office {
    public static void main(String[] args) {
        //constructors in action
        Employee employee = new Employee("Mike", 29, Department.SOFTWARE);
        Employee employee1 = new Employee("Bob", 19, Department.TESTING);
        Employee employee2 = new Employee("Peter", 25, Department.FINANCIAL);

        //overloading once again in action
        System.out.println(employee.takeNotes("Attend training tomorrow on paper", ""));
        System.out.println(employee.takeNotes("Attend training tomorrow on computer", new Computer()).getNotes());
        System.out.println(employee.takeNotes("Attend training tomorrow on phone", new Phone("")).getNotes());

        employee.setName("Bob");
        System.out.println(employee1);
        System.out.println(employee2);
        System.out.println(new Employee());
        System.out.println(new Employee("n/a"));
        System.out.println(new Employee("Bob"));
        System.out.println(new Employee("Peter", 49, Department.FINANCIAL));

    }
}
