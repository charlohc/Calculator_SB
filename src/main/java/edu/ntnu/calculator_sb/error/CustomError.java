package edu.ntnu.calculator_sb.error;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public interface CustomError extends ErrorController {
    @RequestMapping("/equations")
    @ResponseBody
    String error(HttpServletRequest request);

    String getErrorPath();
}
