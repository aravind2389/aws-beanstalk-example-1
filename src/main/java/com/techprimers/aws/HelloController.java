package com.techprimers.aws;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RequestMapping("/hello")
@RestController
public class HelloController {
    
    @GetMapping
    public String hello() {
        return "Hello ATMECS, Work Together";
    }
}