package methods;

import java.util.Random;

public class RandomDemo {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());
            System.out.println(random.nextInt(5));
            System.out.println(random.nextInt(10) - 5);
            System.out.println(random.nextInt(10) + 5);
            System.out.println();
            System.out.println(random.nextBoolean());
            System.out.println(random.nextDouble() + random.nextInt(10));
            System.out.println();
        }
    }
}
