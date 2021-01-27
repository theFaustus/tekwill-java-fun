package javaapi.arrays;

import java.util.Random;

public class CrapsDiceGame {
    static boolean isPoint;
    static int point;

    public static void main(String[] args) {
        Random random = new Random();
        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        int sum = dice1 + dice2;
        System.out.printf("You rolled %d + %d = %d\n", dice1, dice2, sum);

        switch (sum) {
            case 2:
            case 3:
            case 12:
                System.out.println("You Lose");
                break;
            case 7:
            case 11:
                System.out.println("You Win!!!");
                break;
            case 4:
            case 5:
            case 6:
            case 8:
            case 9:
            case 10:
                isPoint = true;
                point = sum;

        }

        while (isPoint) {
            System.out.println("Point is " + point);
            dice1 = random.nextInt(6) + 1;
            dice2 = random.nextInt(6) + 1;
            sum = dice1 + dice2;
            System.out.printf("You rolled %d + %d = %d\n", dice1, dice2, sum);

            if (sum == 7) {
                System.out.println("You Lose.");
                isPoint = false;
            } else if (sum == point) {
                System.out.println("You Win!!!");
                isPoint = false;
            } else
                System.out.println("Try again.\n");
        }
    }
}
