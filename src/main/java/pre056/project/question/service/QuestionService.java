package pre056.project.question.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pre056.project.question.entity.Question;
import pre056.project.question.entity.QuestionRequest;
import pre056.project.question.repository.QuestionRepository;

@Service
public class QuestionService {
    @Autowired
    private final QuestionRepository questionRepository;

    public QuestionService(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    public Question post(QuestionRequest request) {
        Question question = new Question();
        question.setTitle(request.getTitle());
        question.setContents(request.getContents());
        //question.setSkillTag(request.getSkillTag());

        return questionRepository.save(question);
    }
}
