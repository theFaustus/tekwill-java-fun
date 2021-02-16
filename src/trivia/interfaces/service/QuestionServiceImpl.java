package trivia.interfaces.service;

import trivia.interfaces.domain.Question;
import trivia.interfaces.repository.QuestionRepository;

import java.util.Collections;
import java.util.List;

public class QuestionServiceImpl implements QuestionService {
    private final QuestionRepository questionRepository;

    public QuestionServiceImpl(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public List<Question> getQuestionsByLevel(int level) {
        List<Question> questionsByLevel = questionRepository.findQuestionsByLevel(level);
        Collections.shuffle(questionsByLevel);
        return questionsByLevel;
    }

    @Override
    public boolean save(Question question) {
        return questionRepository.save(question);
    }

    @Override
    public boolean delete(Question question) {
        return questionRepository.delete(question);
    }

    @Override
    public List<Question> getAll() {
        return questionRepository.findAll();
    }


}
