package com.techprimers.aws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RequestMapping("/login")
@RestController
public class LoginController {
    @GetMapping
    public String login() {
        return "Login is page is under maintainence";
    }
}