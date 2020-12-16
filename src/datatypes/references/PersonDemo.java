package datatypes.references;

public class PersonDemo {
    public static void main(String[] args) {
        Person p = null; // in stack we have a reference, but not object attached to it - a leash without a dog
        Person p1 = new Person("Peter");  // in stack we have a reference, with an object attached to it - a leash with a dog
        Person p2 = p1;  // in stack we have a reference, with the same address to the same object as p1 - another leash to the same dog

        Person p3 = new Person("Peter"); // a reference of type Person named p3, an object of type Person named p3
        Person p4; // a null reference of type Person - default value of all reference types is null

//        p.name = "Mike"; //every interaction with a null variable results in NullPointerException
//        p.walk();

        int a = 10;
        int b = 10;
        System.out.println(a == b); //equality operator works very good on primitive types
        Person p5 = new Person("Peter"); // the memory address B78965
        Person p6 = new Person("Peter"); // the memory address A78955
        Person p7 = p5;           // the memory address B78965
        System.out.println(p5 == p6); // B78965 == A78955 = false
        System.out.println(p5 == p7); // B78965 == B78965 = true
        System.out.println(p5.equals(p6));
        System.out.println(p5.equals(p7));

        changePrimitive(a);
        System.out.println(a);

        changeObjectType(p5);
        System.out.println(p5.name);

    }

    public static void changePrimitive(int number) {
        number = 11; //no side-effect as a method argument
    }

    public static void changeObjectType(Person person) {
//        person = new Person("Bob");  //no side-effect as a method argument
        person.name = "Bob"; //unpleasing-effect, you can modify the state of an object, side-effect as a method argument
    }
}
