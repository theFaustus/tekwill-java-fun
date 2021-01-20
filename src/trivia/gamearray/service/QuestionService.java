package trivia.gamearray.service;

import trivia.gamearray.domain.Question;
import trivia.gamearray.repository.QuestionRepository;
import trivia.gamearray.util.Shuffler;

public class QuestionService {
    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public Question[] getQuestionsByLevel(int level) {
        return Shuffler.shuffleQuestions(questionRepository.findQuestionsByLevel(level));
    }

}
