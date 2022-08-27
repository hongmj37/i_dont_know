package pre056.project.question.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pre056.project.question.entity.Question;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
