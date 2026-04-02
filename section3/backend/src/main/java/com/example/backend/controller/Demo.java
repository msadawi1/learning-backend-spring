package com.example.backend.controller;

import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class Demo {
    // Support multiple paths and custom names and optional variables
    @GetMapping({"/users/{userId}", "/users/{userId}/posts/{postId}"})
    public String get(@PathVariable(name = "userId") Long customerId, @PathVariable(required = false) String postId) {
        String response = "";
        if (postId == null) {
            response = "User ID is " + customerId;
        } else  {
            response = "User ID is " + customerId + " and Post ID is " + postId;
        }
        return response;
    }

    // Use a path variable map as shortcut
    @GetMapping("/users/{userId}/address/{addressId}")
    public String get(@PathVariable Map<String,String> pathVariables) {
        return "User ID is " + pathVariables.get("userId") + " and Address ID is " + pathVariables.get("addressId");
    }
}