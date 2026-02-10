package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example5 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var vehicle = context.getBean(Vehicle.class);
        vehicle.setName("Vehicle component");
        System.out.println(vehicle.getName());
    }
}
