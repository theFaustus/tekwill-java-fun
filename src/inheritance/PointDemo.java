package inheritance;

import java.util.Arrays;

public class PointDemo {
    public static void main(String[] args) {
        Point p1 = new Point(1.0f, 2.0f);
        System.out.println(p1);
        System.out.println(Arrays.toString(p1.getXY()));
        p1.setXY(1, 5);
        System.out.println(p1);

        MovablePoint mv1 = new MovablePoint(1.0f, 2.0f);
        System.out.println(mv1);
        mv1.move();
        System.out.println(mv1);

        Point p2 = new MovablePoint();
        Point p3 = new Point();

        ((MovablePoint) p2).move();
        if (p3 instanceof MovablePoint)
            ((MovablePoint) p3).move();

    }
}
