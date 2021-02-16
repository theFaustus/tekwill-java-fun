package trivia.interfaces.domain;


import trivia.interfaces.domain.exceptions.EmptyQuestionTextException;
import trivia.interfaces.domain.exceptions.InvalidLevelException;
import trivia.interfaces.domain.exceptions.InvalidScoreException;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Question {
    private List<Answer> answers = new ArrayList<>();
    private int score;
    private int level;
    private String text;

    public Question(int score, int level, String text, List<Answer> answers) {
        this(score, level, text);
        this.answers = answers;
    }

    public Question(int score, int level, String text) {
        if (text.isEmpty()) {
            throw new EmptyQuestionTextException("Question text should not be empty");
        }
        if (score < 0) {
            throw new InvalidScoreException("Score must be greater than 0");
        }
        if (level < 0) {
            throw new InvalidLevelException("Level must be greater than 0");
        }
        this.score = score;
        this.level = level;
        this.text = text;
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

    public List<Answer> getAnswers() {
        return answers;
    }

    public Answer getCorrectAnswer() {
        for (Answer answer : answers) {
            if (answer.isCorrect())
                return answer;
        }
        return null;
    }

    public List<Answer> getWrongAnswers() {
        List<Answer> wrongAnswers = new ArrayList<>();
        for (Answer answer : answers) {
            if (!answer.isCorrect()) {
                wrongAnswers.add(answer);
            }
        }
        Collections.shuffle(wrongAnswers);
        return wrongAnswers;
    }

    public void addAnswer(Answer answer) {
        answers.add(answer);
        answer.setQuestion(this);
    }

    public void removeAnswer(Answer answer) {
        answers.add(answer);
        answer.setQuestion(null);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Question question = (Question) o;
        return score == question.score && level == question.level && Objects.equals(answers,
                                                                                    question.answers) && Objects.equals(
                text,
                question.text);
    }

    @Override
    public int hashCode() {
        return Objects.hash(answers, score, level, text);
    }

    @Override
    public String toString() {
        return "Question{" +
                "answers=" + answers +
                ", score=" + score +
                ", level=" + level +
                ", text='" + text + '\'' +
                '}';
    }
}
