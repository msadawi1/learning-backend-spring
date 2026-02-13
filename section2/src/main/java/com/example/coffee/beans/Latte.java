package com.example.coffee.beans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Latte implements Coffee {
    @Override
    public String makeCoffee() {
        return "Latte is ready";
    }
}