package com.pablo.lab2;
import com.pablo.lab2.services.CalculationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
public class MyController {
    @Autowired
    CalculationService calculate = new CalculationService();
    @GetMapping("/")
    public String getForm(){
        return "index";
    }
    @PostMapping("/result")
    public String submitForm(@RequestParam( required = false) Double a,
                             @RequestParam( required = false) Double b,
                             @RequestParam( required = false) Double c,
                             @RequestParam( required = false) Double d,
                             @RequestParam( required = false) String example,
                             Model model) {
            model.addAttribute("result", calculate.checkingItems(a,b,c,d,example));
            return "result";
    }

}
