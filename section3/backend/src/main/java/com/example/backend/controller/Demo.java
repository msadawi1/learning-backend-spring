package com.example.backend.controller;

import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/users") // Prefixes methods endpoints with base path
public class Demo {
    // Support multiple paths and custom names and optional variables
    @GetMapping({"/{userId}", "/{userId}/posts/{postId}"})
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
    @GetMapping("/{userId}/address/{addressId}")
    public String get(@PathVariable Map<String,String> pathVariables) {
        return "User ID is " + pathVariables.get("userId") + " and Address ID is " + pathVariables.get("addressId");
    }

    // Accepts any type of HTTP Request
    @RequestMapping("/home")
    public String home() {
        return "<h1>Homepage</h1>";
    }

    // Accepts multiple HTTP requests types
    @RequestMapping(value = "/{userId}", method = { RequestMethod.PUT, RequestMethod.PATCH})
    public String update(@PathVariable Long userId) {
        return "Updating user with ID " + userId;
    }

    @GetMapping("/search")
    public String searchWithQueryParams(@RequestParam(required = false, name = "name", defaultValue = "guest") String userName, @RequestParam int age) {
        return "Searching for user with name " + userName + " and age " + age;
    }

    @GetMapping("/headers")
    public String headers(@RequestHeader("User-Agent")  String userAgent,
                          @RequestHeader("User-Location") String userLocation,
                          @RequestHeader(value = "User-Language", required = false, defaultValue = "ar") String userLanguage) {
        if (userLanguage.equals("en")) {
            return "User Agent: " +  userAgent + " and User Location: " + userLocation;
        } else if (userLanguage.equals("ar")) {
            return "وكيل المستخدم: " +  userAgent + " وموقع المستخدم " + userLocation;
        } else  {
            return "Language is not supported";
        }
    }

    @GetMapping("/headers/http-headers")
    public String headers(@RequestHeader HttpHeaders headers) {
        return headers.getFirst("User-Agent");
    }
}