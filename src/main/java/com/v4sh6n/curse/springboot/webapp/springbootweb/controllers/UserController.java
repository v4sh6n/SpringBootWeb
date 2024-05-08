package com.v4sh6n.curse.springboot.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.v4sh6n.curse.springboot.webapp.springbootweb.models.User;

@Controller
public class UserController {

    //metodo handler procesa request y devuelve response bien sea vista o html
    @GetMapping("/details")
    public String details(Model model) {
        User user = new User("John","Doe");

        model.addAttribute("title", "Hello World SprintBoot from GIT");
        model.addAttribute("user",user);
          
    
        
        return "details";
    }

    


}
