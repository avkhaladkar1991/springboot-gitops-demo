package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello from GitOps 🚀";
    }

    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}

