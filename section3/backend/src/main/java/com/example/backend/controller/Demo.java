package com.example.backend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.Callable;

@RestController
public class Demo {
    @GetMapping("/hello")
    public Callable<String> index() {
        return () -> {
            Thread.sleep(3000);
            return "<h1>API Working</h1>";
        };
    }
}