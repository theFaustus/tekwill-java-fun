package datatypes.operators.arithmetic;

import java.util.Scanner;

public class TimeHolderDemo {
    public static void main(String[] args) {
        TimeHolder t1 = new TimeHolder(75864L);
        TimeHolder t2 = new TimeHolder(15364L);
        TimeHolder t3 = new TimeHolder(45864L);
        TimeHolder t4 = new TimeHolder(92864L);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
        System.out.println(t4);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter seconds : ");
        long seconds = scanner.nextLong();
        System.out.println(new TimeHolder(seconds));
    }
}
