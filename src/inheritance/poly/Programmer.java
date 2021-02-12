package inheritance.poly;

public class Programmer extends Employee {
    String name = "this-name";

    @Override
    public void foo() {
        System.out.println("this");
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
