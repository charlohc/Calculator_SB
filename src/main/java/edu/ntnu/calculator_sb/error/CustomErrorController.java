package edu.ntnu.calculator_sb.error;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class CustomErrorController implements CustomError {


    @Override
    @RequestMapping("/equations")
    @ResponseBody
    public String error(HttpServletRequest request) {
        return "<h1>Error occurred</h1>";
    }

    @Override
    public String getErrorPath() {
        return "/equations";
    }
}
