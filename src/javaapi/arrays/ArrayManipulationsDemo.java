package javaapi.arrays;

import java.util.Arrays;
import java.util.Random;

public class ArrayManipulationsDemo {
    public static void main(String[] args) {
        Random r = new Random();

        double[] c;
        c = new double[100];
        for (int i = 0; i < c.length; i++) {
            c[i] = r.nextDouble() + r.nextInt(10);
            System.out.print(c[i] + " ");
        }
        System.out.println();

        double sum = 0;
        for (int i = 0; i < c.length; i++) {
            sum += c[i];
        }
        System.out.println(sum);


        int[] a;
        a = new int[12];
        a[11] = 666;

        int[] b;
        b = new int[34];
        b[0] = a[11];
        System.out.println(b[0]);

        double[] g;
        g = new double[10];
        copyArray(c, g);


        for (int i = 0; i < g.length; i++) {
            if (i == 0)
                System.out.print("[" + g[i]);
            if (i == g.length - 1)
                System.out.print(g[i] + "]");
            else
                System.out.print(g[i] + ", ");
        }

        System.out.println();

        System.out.println(Arrays.toString(b));

        double minElement = c[0];
        double maxElement = c[0];

        for (int i = 0; i < c.length; i++) {
            if (c[i] > maxElement)
                maxElement = c[i];
            else if (c[i] < minElement)
                minElement = c[i];
        }

        System.out.println(Arrays.toString(c));
        System.out.println(minElement);
        System.out.println(maxElement);


    }

    private static void copyArray(double[] c, double[] g) {
        for (int i = 0; i < g.length; i++) {
            g[i] = c[i];
        }
    }
}
