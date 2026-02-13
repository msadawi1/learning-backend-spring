package com.example.scope.beans;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
@Scope(BeanDefinition.SCOPE_PROTOTYPE) // or ("prototype")
public class Session {
    private final String sessionId;
    
    public Session() {
        this.sessionId = UUID.randomUUID().toString();
    }

    public String getSessionId() {
        return sessionId;
    }
}