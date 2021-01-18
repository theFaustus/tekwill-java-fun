package trivia.game.domain;

public class FiftyFiftyHelpOption {
    private boolean isUsed = false;
    private boolean isInvoked = false;

    public void invoke(Question question) {
        System.out.println("    (\uD83E\uDD16) -> Computer says: ");
        System.out.println("          \u2B55 " + question.getAnswerOne() + " - 50%");
        System.out.println("          \u2B55 " + question.getAnswerFour() + " - 50%");
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
