package com.v4sh6n.curse.springboot.webapp.springbootweb.controllers;


import java.util.HashMap;
import java.util.Map;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.v4sh6n.curse.springboot.webapp.springbootweb.models.User;

@RestController
@RequestMapping("/api")
public class UserRestController {

    //metodo handler procesa request y devuelve response bien sea vista o html
    //para mapear un request a una ruta url
    //@RequestMapping(path="/details", method = RequestMethod.GET) 
    @GetMapping("/details")
    public Map<String, Object> details() {
        User user = new User("John","Doe");
        Map<String, Object> body = new HashMap<>();

        body.put("title", "Hello World SprintBoot from GIT");
        body.put("user",user);

    
    
        
        return body;
    }

    


}
