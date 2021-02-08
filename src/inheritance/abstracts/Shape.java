package inheritance.abstracts;

public abstract class Shape {
    public void foo() {
        System.out.println("Something common for all the shapes");
    }

    public abstract void draw();
}
