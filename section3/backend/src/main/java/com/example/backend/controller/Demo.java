package com.example.backend.controller;

import org.springframework.web.bind.annotation.*;

@RestController
public class Demo {
    @GetMapping("/hello")
    public String get(@RequestHeader("User-Agent") String userAgent) {
        return "GET: API Working. User-Agent: " + userAgent;
    }

    @PostMapping("/hello")
    public String post(@RequestHeader("User-Agent") String userAgent, @RequestBody String body) {
        return "POST: API Working. User-Agent: " + userAgent + ", body: " + body;
    }
}