package javaapi.strings;

public class StringDemo {
    public static void main(String[] args) {
        //string pool
        String a = new String("Hello"); //don`t care. adding anyways - addr 1
        String b = "Hello"; //have in string pool? no. adding - addr 2
        String c = "Hello"; //have in string pool? yes. using it - addr 2
        String d = "hello"; //have in string pool? no. adding - addr 3

        System.out.println(a == b); //false - 1 == 2
        System.out.println(b == c); //true - 2 == 2
        System.out.println(c == d); //false - 2 == 3
        System.out.println("hello" == d);  //have in string pool? yes. using it //true - 3 == 3
        System.out.println();
        System.out.println(a.equals(b)); //true - Hello == Hello
        System.out.println(b.equals(c)); //true - Hello == Hello
        System.out.println(c.equals(d)); //false - Hello == [h]ello
        System.out.println("hello".equals(d)); //true - hello == hello

        //creating
        String x = "abcABCxyzzyxXYZ";
        String xx = new String(new char[]{'a', 'b', 'c'});
        String xxx = new String("abc");

        //exploring methods
        System.out.println();
        System.out.println(x.isEmpty());
        System.out.println(x.substring(5));
        System.out.println(x.substring(1, 4));
        System.out.println(x.toLowerCase());
        System.out.println(x.toUpperCase());
        System.out.println(x.concat("ZYX"));
        System.out.println(x.charAt(0));
        System.out.println(x.charAt(5));
        System.out.println(x.endsWith("XYZ"));
        System.out.println(x.endsWith("XY"));
        System.out.println(x.startsWith("abc"));
        System.out.println(x.startsWith("bc"));
        System.out.println(x.indexOf('x'));
        System.out.println(x.indexOf('x', 7));
        System.out.println(x.replace("a", "x"));
        System.out.println(x.matches("\\w*"));
        System.out.println(x.matches("\\d*"));
        System.out.println(x.matches("^(abc)(XYZ)$"));

        //chain the string methods
        x = "PPP";
        //PPP - AAAAAA - aaaaaa - aa - aaBBB
        x = x.replace("P", "AA").toLowerCase().substring(2, 4).concat("BBB");
        System.out.println(x);

        //aaBBB
        x = x.toLowerCase();
        //aabbb
        x = x.substring(2, 4);
        //bb
        x = x.concat("BBB");
        //bbBBB

        System.out.println(x);

    }
}
