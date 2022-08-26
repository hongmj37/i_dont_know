package pre056.project.question.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import pre056.project.question.service.QuestionService;

@Controller
@RequestMapping("/questions")
public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @GetMapping
    public ResponseEntity read() {

    }

    @GetMapping("/{question-id}")
    public ResponseEntity read() {

    }

    @PostMapping("/")
    public ResponseEntity read() {

    }

    @PatchMapping("/{question-id}")
    public ResponseEntity read() {

    }

    @DeleteMapping("/{question-id}")
    public ResponseEntity read() {

    }

}
