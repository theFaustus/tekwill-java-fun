package datatypes.operators.wrappers;

public class WrappersDemo {
    public static void main(String[] args) {
        //assisgnment
        Integer integer = 5;
        //constructor
        Integer integer1 = new Integer(5);
        //static
        Integer integer2 = Integer.valueOf(5);
        Integer integer3 = Integer.valueOf("5");
        Integer integer4 = Integer.valueOf(WebController.getIdOfUser());

        System.out.println(integer);
        System.out.println(integer1);
        System.out.println(integer2);
        System.out.println(integer3);
        System.out.println(integer4);
        System.out.println(integer4 + integer3);

        //Integer integer5 = new Integer(); no such constructor in any of wrapper classes
        //Character character = new Character("a"); no such constructor in Character class, use single quotes
        Character character = new Character('a');
    }


}
