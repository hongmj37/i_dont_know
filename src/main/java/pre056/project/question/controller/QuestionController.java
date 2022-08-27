package pre056.project.question.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pre056.project.question.entity.Question;
import pre056.project.question.service.QuestionService;

@Controller
@RequestMapping("/questions/")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    /**
     * 전체 게시글 조회
     */
    @GetMapping
    public ResponseEntity getQuestions() {
        return null;
    }
    /**
     * 게시글 하나 조회
     */
    @GetMapping("{question-id}")
    public ResponseEntity getQuestion() {
        return null;
    }

    /**
     * 게시글 등록
     */
    @PostMapping
    public ResponseEntity postQuestion(@RequestBody Question question) {
        return null;
    }

    /**
     * 게시글 수정
     */
    @PatchMapping("{question-id}")
    public ResponseEntity patchQuestion() {
        return null;
    }

    /**
     * 게시글 삭제
     */
    @DeleteMapping("{question-id}")
    public ResponseEntity deleteQuestion() {
        return null;
    }

}
