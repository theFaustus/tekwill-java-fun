package trivia.game.domain;

import java.util.Random;

public class AskAudienceHelpOption {
    private boolean isUsed = false;
    private boolean isInvoked = false;

    public void invoke(Question question) {
        System.out.println("    (\uD83D\uDC65) -> Auditory voted like this: ");
        int firstProbability = new Random().nextInt(24);
        int secondProbability = new Random().nextInt(24);
        int thirdProbability = new Random().nextInt(24);
        System.out.println("          \u2B55 " + question.getWrongAnswerOne() + " - " + firstProbability + "%");
        System.out.println("          \u2B55 " + question.getWrongAnswerTwo() + " - " + secondProbability + "%");
        System.out.println("          \u2B55 " + question.getWrongAnswerThree() + " - " + thirdProbability + "%");
        System.out.println("          \u2B55 " + question.getCorrectAnswer() + " - " + (100 - firstProbability - secondProbability - thirdProbability) + "%");
        setUsed(true);
        setInvoked(false);
    }

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }

    public boolean isInvoked() {
        return isInvoked;
    }

    public void setInvoked(boolean invoked) {
        isInvoked = invoked;
    }
}
