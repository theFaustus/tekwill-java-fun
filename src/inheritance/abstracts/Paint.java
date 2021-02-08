package inheritance.abstracts;

import java.util.ArrayList;
import java.util.List;

public class Paint {
    public static void main(String[] args) {
        Circle circle = new Circle();
        Rectangle rectangle = new Rectangle();

        List<Shape> shapes = new ArrayList<>();
        shapes.add(circle);
        shapes.add(rectangle);
        for (Shape shape : shapes) {
            shape.foo();
            shape.draw();
        }

    }
}
