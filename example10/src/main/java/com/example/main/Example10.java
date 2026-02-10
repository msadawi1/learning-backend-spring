package com.example.main;

import com.example.beans.Person;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example10 {
    public static void main(String[] args) {

        // Create context
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // Spring can check the parameters of the person method, and sees that it has a Vehicle
        // so it will create it first before the person bean
        Person person = context.getBean(Person.class);

        System.out.println(person.getVehicle());

        context.close();
    }
}
