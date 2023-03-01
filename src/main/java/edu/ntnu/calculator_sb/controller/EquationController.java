package edu.ntnu.calculator_sb.controller;

import edu.ntnu.calculator_sb.model.AnswerObject;
import edu.ntnu.calculator_sb.service.EquationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EquationController {

    @Autowired
    private EquationService equationService;
    Logger logger = (Logger) LoggerFactory.getLogger(this.getClass());
    @CrossOrigin("*")
    @PostMapping("/equations")
    public String getEquation(@RequestBody(required = false) String equation) {
        return equation;
    }

    @CrossOrigin("*")
    @PostMapping("/answer")
    public AnswerObject showAnswer(@RequestBody AnswerObject answerObject) {
        logger.info("recived");
        return equationService.solveEquation(answerObject);
    }
}
