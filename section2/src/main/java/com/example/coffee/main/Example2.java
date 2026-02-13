package com.example.coffee.main;

import com.example.coffee.beans.Coffee;
import com.example.coffee.beans.CoffeeShop;
import com.example.coffee.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Example2 {
    public static void main(String[] args) {

        // Create context
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        var coffeeShop = context.getBean(CoffeeShop.class);

        Coffee coffee = coffeeShop.getCoffee();

        System.out.println(coffee.makeCoffee());

        context.close();
    }
}
