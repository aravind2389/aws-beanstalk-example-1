package com.techprimers.aws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RequestMapping( {"/","/home"} )
@RestController
public class HelloController {
    
    @GetMapping
    public String hello() {
        return "Hello All, Good Morning ";
    }
}

@RequestMapping("/login")
@RestController
public class LoginController {
    @GetMapping
    public String login() {
        return "Login page is under working";
    }
}