package trivia.game.domain;


public class Question {
    private int score;
    private int level;
    private String text;
    private Answer wrongAnswerOne;
    private Answer wrongAnswerTwo;
    private Answer wrongAnswerThree;
    private Answer correctAnswer;

    public Question(int score, int level, String text, Answer wrongAnswerOne, Answer wrongAnswerTwo, Answer wrongAnswerThree, Answer correctAnswer) {
        this.score = score;
        this.level = level;
        this.text = text;
        this.wrongAnswerOne = wrongAnswerOne;
        this.wrongAnswerTwo = wrongAnswerTwo;
        this.wrongAnswerThree = wrongAnswerThree;
        this.correctAnswer = correctAnswer;
    }

    public Answer getWrongAnswerOne() {
        return wrongAnswerOne;
    }

    public void setWrongAnswerOne(Answer wrongAnswerOne) {
        this.wrongAnswerOne = wrongAnswerOne;
    }

    public Answer getWrongAnswerTwo() {
        return wrongAnswerTwo;
    }

    public void setWrongAnswerTwo(Answer wrongAnswerTwo) {
        this.wrongAnswerTwo = wrongAnswerTwo;
    }

    public Answer getWrongAnswerThree() {
        return wrongAnswerThree;
    }

    public void setWrongAnswerThree(Answer wrongAnswerThree) {
        this.wrongAnswerThree = wrongAnswerThree;
    }

    public Answer getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(Answer correctAnswer) {
        this.correctAnswer = correctAnswer;
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
                ", wrongAnswerOne=" + wrongAnswerOne +
                ", wrongAnswerTwo=" + wrongAnswerTwo +
                ", wrongAnswerThree=" + wrongAnswerThree +
                ", correctAnswer=" + correctAnswer +
                '}';
    }
}
