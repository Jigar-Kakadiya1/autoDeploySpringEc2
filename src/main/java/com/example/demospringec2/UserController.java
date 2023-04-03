package com.example.demospringec2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/user")
    public String user() {
        return "Hello User!";
    }

    @GetMapping("/")
    public String home() {
        return "welcome to home!";
    }
}
