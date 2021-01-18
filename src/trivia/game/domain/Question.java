package trivia.game.domain;


public class Question {
    private int score;
    private int level;
    private String text;
    private Answer answerOne;
    private Answer answerTwo;
    private Answer answerThree;
    private Answer answerFour;

    public Question(int score, int level, String text, Answer answerOne, Answer answerTwo, Answer answerThree, Answer answerFour) {
        this.score = score;
        this.level = level;
        this.text = text;
        this.answerOne = answerOne;
        this.answerTwo = answerTwo;
        this.answerThree = answerThree;
        this.answerFour = answerFour;
    }

    public Answer getAnswerOne() {
        return answerOne;
    }

    public void setAnswerOne(Answer answerOne) {
        this.answerOne = answerOne;
    }

    public Answer getAnswerTwo() {
        return answerTwo;
    }

    public void setAnswerTwo(Answer answerTwo) {
        this.answerTwo = answerTwo;
    }

    public Answer getAnswerThree() {
        return answerThree;
    }

    public void setAnswerThree(Answer answerThree) {
        this.answerThree = answerThree;
    }

    public Answer getAnswerFour() {
        return answerFour;
    }

    public void setAnswerFour(Answer answerFour) {
        this.answerFour = answerFour;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        return "Question{" +
                "score=" + score +
                ", level=" + level +
                ", text='" + text + '\'' +
                ", wrongAnswerOne=" + answerOne +
                ", wrongAnswerTwo=" + answerTwo +
                ", wrongAnswerThree=" + answerThree +
                ", correctAnswer=" + answerFour +
                '}';
    }
}
