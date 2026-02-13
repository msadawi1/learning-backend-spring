package com.example.autowiring.main;

import com.example.autowiring.beans.Person;
import com.example.autowiring.beans.Vehicle;
import com.example.autowiring.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Autowiring {
    public static void main(String[] args) {

        // Create context
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Person person = context.getBean(Person.class);
        Vehicle vehicle = context.getBean(Vehicle.class);

        System.out.println(vehicle);

        System.out.println("Vehicle that " + person.getName() + " uses is " + person.getVehicle());

        context.close();
    }
}
