package datatypes.operators.wrappers;

public class WrappersDemo {
    public static void main(String[] args) {
        //assignment
        Integer integer = 5;
        Character character = 'c';
        Boolean b = false;
        //constructor
        Integer integer1 = new Integer(5);
        Character character1 = new Character('c');
        Short shorter = new Short("5");
        //static
        Integer integer2 = Integer.valueOf(5);
        Integer integer3 = Integer.valueOf("5");
        Integer integer4 = Integer.valueOf(WebController.getIdOfUser());
        Character character2 = Character.valueOf('c');
        Boolean boolean2 = Boolean.valueOf(true);

        System.out.println(integer);
        System.out.println(integer1);
        System.out.println(integer2);
        System.out.println(integer3);
        System.out.println(integer4);
        System.out.println(integer4 + integer3);

        //Integer integer5 = new Integer(); no such constructor in any of wrapper classes
        //Character character = new Character("a"); no such constructor in Character class, use single quotes
        Character character3 = new Character('a');

        //obtaining primitive value from a wrapper
        int i = integer;
        double v = integer.doubleValue();
        byte b1 = integer.byteValue();
        char c = character.charValue();

        //parsing Strings into primitive values
        int i1 = Integer.parseInt("1");
        short i2 = Short.parseShort("34");

        //byte b2 = Byte.parseByte("345645"); Value out of range. Value:"345645" exception will be thrown

        System.out.println(Boolean.parseBoolean("false"));
        System.out.println(Boolean.parseBoolean("true"));
        System.out.println(Boolean.parseBoolean("TrUe"));
        System.out.println(Boolean.parseBoolean("TrUe1"));
        System.out.println(Boolean.parseBoolean("TrUe1324rsdf"));


        //caching in action
        Integer studentMathMark = 10;
        Integer studentMathMark2 = 10;
        Integer studentMathMark3 = Integer.valueOf(10);
        Integer studentMathMark4 = Integer.valueOf(10);
        Integer studentMathMark5 = Integer.valueOf(10);

        System.out.println();
        System.out.println(integer1 == integer2);
        System.out.println(studentMathMark == studentMathMark2);
        System.out.println(studentMathMark.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(integer1)));
        System.out.println(studentMathMark.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(integer2)));
        System.out.println(studentMathMark.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(studentMathMark)));
        System.out.println(studentMathMark.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(studentMathMark2)));
        System.out.println(studentMathMark.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(studentMathMark3)));
        System.out.println(studentMathMark.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(studentMathMark4)));
        System.out.println(studentMathMark.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(studentMathMark5)));


        //no-caching in action
        Integer studentMathMark6 = 128;
        Integer studentMathMark7 = 128;
        System.out.println(studentMathMark6 == studentMathMark7);
        System.out.println(studentMathMark6.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(studentMathMark6)));
        System.out.println(studentMathMark7.getClass().getName() + "@" + Integer.toHexString(System.identityHashCode(studentMathMark7)));

        //autoboxing
        Integer ii = 1; // going to be replaced by Integer.valueOf(1) - autoboxing
        Character cc = 'c'; // going to be replaced by Character.valueOf('c') - autoboxing

        //unboxing
        int primitiveInt = ii; // going to be replaced by ii.intValue()
        char primitiveChar = cc; // going to be replaced by cc.charValue()

        Integer tricky = null;
        Object o = new Integer(5);
        int primitiveTricky = tricky; // tricky.intValue()


    }


}
