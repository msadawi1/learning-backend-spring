package com.example.autowiring.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class Vehicle {
    private String name;

    public Vehicle() {
        System.out.println("Vehicle Constructor Invoked");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init() {
        this.name = "Toyota";
    }

    @Override
    public String toString() {
        return "model - " + name;
    }
}
