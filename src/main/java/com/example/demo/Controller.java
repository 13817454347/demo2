package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    @GetMapping("/demo")
    public String demo() {
        System.out.println(123);
        return "123";
    }
}
