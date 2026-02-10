package com.example.main;

import com.example.beans.Person;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example9 {
    public static void main(String[] args) {

        // Create context
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // At startup, Spring will scan for the Person bean and see that it has
        // a dependency bean of Vehicle, so Vehicle will be constructed before person
        // even though we are creating Person first in the person method
        Person person = context.getBean(Person.class);

        System.out.println(person.getVehicle());

        context.close();
    }
}
