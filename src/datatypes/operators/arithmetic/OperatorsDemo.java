package datatypes.operators.arithmetic;

public class OperatorsDemo {
    public static void main(String[] args) {
        int a = 2;
        float b = 2.3f;
        int c = a;

        System.out.println("Assignment");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //simplify
        int d = 5;
        System.out.println(d);
        d = d - 5;
        System.out.println(d);
        d -= 5;
        System.out.println(d);

        System.out.println("Simplification of assignment");
        //simplify
        d = 5;
        System.out.println(d);
        d = d * 5;
        System.out.println(d);
        d *= 5;
        System.out.println(d);

//        int z = true;
//        double y = false;
//        long w = 2.3f;

        int j = 12378354;
//        byte k = j; can`t fit
        byte k = 3;
        int l = k;

        System.out.println("Applying to char addition");
        char x = 'a'; //7
        System.out.println(x);
        x += 1;
        System.out.println(x);
        x += 1;
        System.out.println(x);
        x += 1;
        System.out.println(x);
        //x = x++; // !!! x = (x = x + 1) => x = original x
        System.out.println(x);
        x = ++x; // !!! x = (x = x + 1) => x = incremented x
        System.out.println(x);

        System.out.println("Arithmetic operators");
        //arithmetic operators
        a = 10;
        d = 3;
        double aDouble = 2.0;
        double floatingResult = 0;
        int result = a + d;
        System.out.println(result);
        result = a - d;
        System.out.println(result);
        result = a * d;
        System.out.println(result);
        result = a / d;
        System.out.println(result);
        floatingResult = aDouble / d;
        System.out.println(floatingResult);
        result = a % d;
        System.out.println(result);
        System.out.println("Increment operators");
        //increment-operators
        int p = 1;
        System.out.println(p++); // p = p + 1 ; p = 2
        System.out.println(++p); // p = 3
        System.out.println(p--); // p = 2
        System.out.println(--p); // p = 1

        System.out.println(a - ++p); //8
        System.out.println(a - p++); //8

        System.out.println(p); //3
        p++; // x = x++;
        System.out.println(p); //4
        ++p;
        System.out.println(p); //5

        System.out.println();
        int r = 10;
        r = r++ + r + r-- - r-- + ++r; //10 + 11 + 11 - 10 + 10
        System.out.println(r);

        System.out.println(Math.sqrt(49));
        System.out.println(Math.pow(49.0, 3.0));
        System.out.println(Math.min(9, 5));
        System.out.println(Math.max(9, 5));


    }
}
