package com.example.beans;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Service;

@Service
public class DBService {
    private String query;

    @PostConstruct
    public void init(){
        System.out.println("Initializing DB connection...");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Terminating connection to the DB..");
    }
}
