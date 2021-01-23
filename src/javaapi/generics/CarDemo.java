package javaapi.generics;

public class CarDemo {
    public static void main(String[] args) {
        Car c1 = new Car("Mercedes", "S300");
        Car c2 = new Car("BMW", "X5");
        Car c3 = new Car("Mercedes", "S300");
        Car c4 = new Car("Mercedes", "S300");

        Car c5 = new Car("RTO", "A1");

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        System.out.println(c1 == c2);
        System.out.println(c2 == c3);
        System.out.println(c3 == c1);

        System.out.println();

        /*
        *   public boolean equals(Object obj) {
                return (this == obj);
            }
        * */

        System.out.println(c1.equals(c2)); // return c1 == c2
        System.out.println(c2.equals(c3));
        System.out.println(c3.equals(c1));

        System.out.println("Contracts equals");
        //contract method equals
        System.out.println(c3.equals(c3)); //reflexive
        System.out.println();
        System.out.println(c3.equals(c1));
        System.out.println(c1.equals(c3)); //symmetry
        System.out.println();
        System.out.println(c1.equals(c3));
        System.out.println(c3.equals(c4));
        System.out.println(c1.equals(c4)); //transitivity
        System.out.println();
        System.out.println(c1.equals(c3));
        System.out.println(c1.equals(c3));
        System.out.println(c1.equals(c3));
        System.out.println(c1.equals(c3));
        System.out.println(c1.equals(c3)); //consistency
        System.out.println(c1.equals(null)); //non-nullity

        System.out.println("Hashcode contract");
        //contract method hashcode
        //same integer
        System.out.println(c1.hashCode());
        System.out.println(c1.hashCode());
        System.out.println(c1.hashCode());
        //c3 and c1 should have the same hashcode
        System.out.println(c3.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c3.hashCode());

        //c2 and c5 may produce hashcode collision
        System.out.println(c2.hashCode());
        System.out.println(c5.hashCode());


//        System.out.println("abc".equals("abc"));


    }
}
