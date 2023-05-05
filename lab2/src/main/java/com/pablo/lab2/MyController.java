package com.pablo.lab2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {
    @GetMapping("/")
    public String getForm(){
        return "index";
    }
    @PostMapping("/calculate")
    public String submitForm(@RequestParam(value = "a", required = false) Double a,
                             @RequestParam(value = "b", required = false) Double b,
                             @RequestParam(value = "c", required = false) Double c,
                             @RequestParam(value = "d", required = false) Double d,
                             @RequestParam(value = "example", required = false) String example,
                             Model model) {
        if (a == null || b == null || c == null || d == null || example == null || example.trim().isEmpty()) {
            model.addAttribute("result", "Потрібно заповнити всі поля");
            return "index";
        }else {
            model.addAttribute("result", Calculator.calculate(a,b,c,d, example));
            return "index";
        }

    }
}
