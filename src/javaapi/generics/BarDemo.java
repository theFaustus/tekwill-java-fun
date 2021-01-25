package javaapi.generics;

public class BarDemo {

    public static void main(String[] args) {
        Bar bob = new Bar("bob");
        Bar bob1 = new Bar("bob1");
        Bar bob2 = new Bar("bob2");
        Bar bob3 = new Bar("bob");

        System.out.println(bob == bob1);
        System.out.println(bob.equals(bob2));
        System.out.println(bob == bob3);
        System.out.println(bob.equals(bob3));
    }


}
