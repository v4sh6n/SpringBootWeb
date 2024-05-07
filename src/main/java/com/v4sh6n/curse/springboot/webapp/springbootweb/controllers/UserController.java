package com.v4sh6n.curse.springboot.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    //metodo handler procesa request y devuelve response bien sea vista o html
    @GetMapping("/details")
    public String details(Model model) {
        model.addAttribute("title", "Hello World SprintBoot from GIT");
        model.addAttribute("name", "John");
        model.addAttribute("lastName", "Doe");
    
    
        
        return "details";
    }

    


}
