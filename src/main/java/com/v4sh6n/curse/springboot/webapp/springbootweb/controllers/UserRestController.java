package com.v4sh6n.curse.springboot.webapp.springbootweb.controllers;


import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {

    //metodo handler procesa request y devuelve response bien sea vista o html
    @GetMapping("/details2")
    public Map<String, Object> details() {
       
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hello World SprintBoot from GIT");
        body.put("name", "John");
        body.put("lastName", "Doe");
    
    
        
        return body;
    }

    


}
