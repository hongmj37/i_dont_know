package pre056.project.question.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pre056.project.question.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
