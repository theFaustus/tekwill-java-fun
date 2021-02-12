package inheritance.poly;

public class Employee {
    String name = "super-name";

    public void foo() {
        System.out.println("super");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
