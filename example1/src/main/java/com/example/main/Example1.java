package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example1 {
    public static void main(String[] args) {
        // option 1: create Plain Old Java Objects (not added to Spring context_
        var audi = new Vehicle();
        audi.setName("Audi");
        System.out.println(audi.getName());

        // option 2: define an Annotation application context IoC container and create the bean inside
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var ferrari = context.getBean(Vehicle.class);
        System.out.println(ferrari.getName());
    }
}
