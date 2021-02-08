package javaapi.arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesAssigner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter number of students : ");
//        int numberOfStudents = scanner.nextInt();
        System.out.println("Enter the scores : ");
        String[] stringScores = scanner.nextLine().split(" ");
        int[] scores = new int[stringScores.length];

        for (int i = 0; i < scores.length; i++) {
            scores[i] = Integer.parseInt(stringScores[i]);
        }

//        Collections.reverse(Arrays.asList(scores)); About reversing a collection
//        System.out.println(Arrays.asList(scores));


//        int bestScore = getBestScore(scores);
        int bestScore = getBestScoreUsingSorting(scores);
        Map<Integer, Character> studentIdToGrades = getGradesBasedOnBestScore(scores, bestScore);

        for (Map.Entry<Integer, Character> e : studentIdToGrades.entrySet()) {
            System.out.println("Student " + e.getKey() + " got a " + e.getValue());
        }
    }

    private static Map<Integer, Character> getGradesBasedOnBestScore(int[] scores, int bestScore) {
        Map<Integer, Character> studentIdToGrades = new HashMap<>();
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] >= bestScore - 10)
                studentIdToGrades.put(i, 'A');
            else if (scores[i] >= bestScore - 20)
                studentIdToGrades.put(i, 'B');
            else if (scores[i] >= bestScore - 30)
                studentIdToGrades.put(i, 'C');
            else if (scores[i] >= bestScore - 40)
                studentIdToGrades.put(i, 'D');
            else
                studentIdToGrades.put(i, 'F');
        }
        return studentIdToGrades;
    }

    private static int getBestScore(int[] scores) {
        int bestScore = Integer.MIN_VALUE;
        for (int score : scores) {
            if (score > bestScore)
                bestScore = score;
        }
        return bestScore;
    }

    private static int getBestScoreUsingSorting(int[] scores) {
        int[] temp = Arrays.copyOf(scores, scores.length);
        Arrays.sort(temp);
        return temp[temp.length - 1];
    }
}
