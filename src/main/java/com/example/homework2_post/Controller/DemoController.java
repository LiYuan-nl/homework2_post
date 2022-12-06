package com.example.homework2_post.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/demo")
public class DemoController {
    @GetMapping
    public  String index(Model model){
        //model.addAttribute("message", "Hello Spring MVC!");
        return "demo";
    }
}
