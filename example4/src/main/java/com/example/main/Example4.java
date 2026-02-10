package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example4 {
    public static void main(String[] args) {

        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Name of the bean is specified -> fallback to the highest priority
        var kia = context.getBean("kiaVehicle", Vehicle.class);
        System.out.println(kia.getName());

        // Name of the bean isn't specified -> fallback to primary
        var audi = context.getBean(Vehicle.class);
        System.out.println(audi.getName());
    }
}
