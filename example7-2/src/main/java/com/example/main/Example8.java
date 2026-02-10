package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Random;
import java.util.function.Supplier;

public class Example8 {
    public static void main(String[] args) {

        /*
        * @Component and @Bean annotations create beans at app startup, if we need to use a bean
        * conditionally we would need to create all the bean types first before checking conditions
        * which takes a lot of resources
        * registerBean() allows us to create beans dynamically at runtime, usually using conditions
        * that are not known at compile-time, allowing us to create beans that are only needed.
        * */

        // create the context first
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // create audi supplier (lambda)
        Supplier<Vehicle> audiSupplier =() -> {
            var audi = new Vehicle();
            audi.setName("Audi");
            return audi;
        };

        // create bmw supplier (lambda)
        Supplier<Vehicle> bmwSupplier =() -> {
            var bmw = new Vehicle();
            bmw.setName("BMW");
            return bmw;
        };

        // get a random number and conditionally create the bean
        Random random = new Random();
        int rand = random.nextInt(2); // 0 or 1

        if (rand == 0) {
            context.registerBean("audi", Vehicle.class, audiSupplier);
        } else {
            context.registerBean("bmw", Vehicle.class, bmwSupplier);
        }

        var car = context.getBean(Vehicle.class);

        System.out.println("Random integer generated: " + rand);
        System.out.println("Car name: " + car.getName());

        context.close();
    }
}
