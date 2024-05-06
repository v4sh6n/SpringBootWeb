package com.v4sh6n.curse.springboot.webapp.springbootweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    //metodo handler procesa request y devuelve response bien sea vista o html
    @GetMapping("/details")
    public String details() {
        
        return "details";
    }

    


}
