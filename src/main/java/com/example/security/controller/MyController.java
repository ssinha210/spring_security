package com.example.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MyController {

    @GetMapping("/")
    public String home() {
        return "Welcome to the home page!";
    }

    @GetMapping("/admin")
    public String admin() {
        return "Admin Dashboard";
    }

    @GetMapping("/user")
    public String user() {
        return "User Dashboard";
    }
}