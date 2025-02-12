package com.revision.APIs.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class Home {

    @GetMapping("/")
    public String greet(){
        return "Hi, I am Deepak";
    }

    @GetMapping("/loc")
    public String location(){
        return "I am at Home";
    }

}
