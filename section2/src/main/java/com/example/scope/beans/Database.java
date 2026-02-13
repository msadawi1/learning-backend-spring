package com.example.scope.beans;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope(BeanDefinition.SCOPE_SINGLETON) // or ("singleton"), optional
public class Database {
    public Boolean connect() {
        return true;
    }
}