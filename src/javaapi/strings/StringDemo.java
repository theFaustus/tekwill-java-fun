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


        String line = "";
//        for (int i = 0; i < Integer.MAX_VALUE; i++) {
//            line += i; BAD PRACTICE
//        }

        String s = "";
        s += "Java";
        s += " is awesome";
        for (int i = 0; i < 10; i++) {
            s += " " + i;
        }
        System.out.println(s);

        StringBuilder sbuilder = new StringBuilder();
        sbuilder.append("Java");
        sbuilder.append(" is ").append("awesome");
        for (int i = 0; i < 10; i++) {
            sbuilder.append(" ").append(i);
        }

        System.out.println(sbuilder.toString());
        sbuilder.insert(16, "-1 ");
        System.out.println(sbuilder.toString());


        char[] chars = {'a', 'b', 'c', 'v', 'e', 'r', 'y', ' '};
        sbuilder.insert(8, chars, 3, 5);

        System.out.println(sbuilder.toString());

        sbuilder.delete(sbuilder.length() - 5, sbuilder.length());
        System.out.println(sbuilder.toString());

        sbuilder.deleteCharAt(sbuilder.length() - 2);
        System.out.println(sbuilder.toString());

        System.out.println(sbuilder.reverse().toString());

        System.out.println(new StringBuilder(Integer.toString(789456)).reverse().toString());
        System.out.println(new StringBuilder(Integer.toString(-789456)).reverse().toString());

        System.out.println(sbuilder.reverse().toString());
        System.out.println(sbuilder.replace(19, 27, "eeeeeeeeeeeeee").toString()); //sb replace
        System.out.println(sbuilder.toString().replace("e 2", "eeeeeeeeeeeeee")); //str replace

        System.out.println(sbuilder.substring(0, 4));
        System.out.println(sbuilder.subSequence(0, 4));


        System.out.println(new StringBuilder("").append("Java is awesome").reverse().insert(2, "8").deleteCharAt(1).indexOf("w"));


        //StringBuffer sbuffer = new StringBuffer(); don`t use as it has a big impact on performance because of the syncronized methods, better go with StringBuilder

    }
}
