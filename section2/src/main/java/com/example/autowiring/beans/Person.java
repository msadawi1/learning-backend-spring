package com.example.autowiring.beans;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    private String name;

    // Option 1: Field injection
    // @Autowired
    private Vehicle vehicle;

    // Option 3: Constructor injection

    public Person(Vehicle vehicle) {
        this.vehicle = vehicle;
        System.out.println("Person Constructor Invoked");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @PostConstruct
    public void init() {
        this.name = "Man";
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    // Option 2: Setter injection
    @Autowired
    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
