package trivia.game.engine;

import trivia.game.domain.AskAudienceHelpOption;
import trivia.game.domain.AskFriendHelpOption;
import trivia.game.domain.FiftyFiftyHelpOption;
import trivia.game.domain.Question;

import java.util.Scanner;

public class TriviaGame {

    private AskAudienceHelpOption askAudienceHelpOption = new AskAudienceHelpOption();
    private AskFriendHelpOption askFriendHelpOption = new AskFriendHelpOption();
    private FiftyFiftyHelpOption fiftyFiftyHelpOption = new FiftyFiftyHelpOption();

    private Question currentQuestion;

    private int currentScore;
    private int numberOfHelpOptionsAvailable;
    private int questionNumber;
    private boolean gameOver;

    public TriviaGame() {
        initializeGame();
    }

    public void startGame() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Do you want to be a the Ultimate Trivia Man \uD83E\uDD13? ---");
        do {
            displayHelpOptionsMessage();
            displayQuestions();

            System.out.print("answer > ");
            String userAnswer = scanner.nextLine();

            validateResponse(userAnswer);

            if (questionNumber >= 5)
                endGameWithCongratulations();

        } while (!gameOver);
    }

    private void displayHelpOptionsMessage() {
        System.out.println("    [\u2753] You have  " + numberOfHelpOptionsAvailable + " help options ( ASK a Friend - [H1], ASK Auditory - [H2], 50/50 - [H3])");
    }

    private void initializeGame() {
        gameOver = false;

        questionNumber = 1;
        currentQuestion = null;
        currentScore = 0;
        numberOfHelpOptionsAvailable = 3;

        askAudienceHelpOption = new AskAudienceHelpOption();
        askFriendHelpOption = new AskFriendHelpOption();
        fiftyFiftyHelpOption = new FiftyFiftyHelpOption();

    }

    private void displayQuestions() {
        switch (questionNumber) {
            case 1:
                displayQuestion(Questions.LEVEL_1_QUESTION_1);
                break;
            case 2:
                displayQuestion(Questions.LEVEL_1_QUESTION_2);
                break;
            case 3:
                displayQuestion(Questions.LEVEL_2_QUESTION_1);
                break;
            case 4:
                displayQuestion(Questions.LEVEL_2_QUESTION_2);
                break;
        }
    }


    private void displayQuestion(Question question) {
        if (askFriendHelpOption.isInvoked()) {
            askFriendHelpOption.invoke(question);
            numberOfHelpOptionsAvailable--;
        } else if (askAudienceHelpOption.isInvoked()) {
            askAudienceHelpOption.invoke(question);
            numberOfHelpOptionsAvailable--;
        } else if (fiftyFiftyHelpOption.isInvoked()) {
            fiftyFiftyHelpOption.invoke(question);
            numberOfHelpOptionsAvailable--;
        } else {
            System.out.println("    [\uD83D\uDCCC] " + questionNumber + ". " + question.getText());
            System.out.println("          \u2B55 " + question.getAnswerOne());
            System.out.println("          \u2B55 " + question.getAnswerTwo());
            System.out.println("          \u2B55 " + question.getAnswerThree());
            System.out.println("          \u2B55 " + question.getAnswerFour());
        }

        currentQuestion = question;
    }

    private void validateResponse(String questionResponse) {
        if ((currentQuestion.getAnswerOne().isCorrect() && questionResponse.equalsIgnoreCase(currentQuestion.getAnswerOne().getLetter()))
                || (currentQuestion.getAnswerTwo().isCorrect() && questionResponse.equalsIgnoreCase(currentQuestion.getAnswerTwo().getLetter()))
                || (currentQuestion.getAnswerThree().isCorrect() && questionResponse.equalsIgnoreCase(currentQuestion.getAnswerThree().getLetter()))
                || (currentQuestion.getAnswerFour().isCorrect() && questionResponse.equalsIgnoreCase(currentQuestion.getAnswerFour().getLetter()))) {
            questionNumber++;
            currentScore += currentQuestion.getScore();
            System.out.println("    [\uD83E\uDD29] Yaaay! Current score : " + currentScore);
        } else if (questionResponse.equalsIgnoreCase("H1") && !askFriendHelpOption.isUsed()) {
            askFriendHelpOption.setInvoked(true);
        } else if (questionResponse.equalsIgnoreCase("H2") && !askAudienceHelpOption.isUsed()) {
            askAudienceHelpOption.setInvoked(true);
        } else if (questionResponse.equalsIgnoreCase("H3") && !fiftyFiftyHelpOption.isUsed()) {
            fiftyFiftyHelpOption.setInvoked(true);
        } else if (questionResponse.equalsIgnoreCase("H1") || questionResponse.equalsIgnoreCase("H2") || questionResponse.equalsIgnoreCase("H3")) {
            System.out.println("     [\u2757] You`ve used all of your help options, now please respond.");
        } else {
            System.out.println("     [\uD83D\uDE22] Oopsie... Game Over!");
            gameOver = true;
        }
    }

    private void endGameWithCongratulations() {
        System.out.println("    [\uD83E\uDD73] You won!");
        System.out.println("    [\uD83E\uDD73] You got : " + currentScore);
        gameOver = true;
    }

}
