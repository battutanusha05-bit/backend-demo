package com.example.kapidemo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KapiController {

    @GetMapping("/")
    public String hello() {
        return "Spring Boot Project Running Successfully!";
    }
}