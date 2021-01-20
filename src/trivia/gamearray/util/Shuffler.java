package trivia.gamearray.util;

import trivia.gamearray.domain.Answer;
import trivia.gamearray.domain.Question;

import java.util.Random;

public class Shuffler {
    public static Answer[] shuffleAnswers(Answer[] array) {
        int index;
        Answer temp = null;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            //swap
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        return array;
    }

    public static Question[] shuffleQuestions(Question[] array) {
        int index;
        Question temp = null;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            //swap
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
