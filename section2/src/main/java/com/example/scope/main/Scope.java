package com.example.scope.main;

import com.example.scope.beans.Database;
import com.example.scope.beans.Session;
import com.example.scope.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Scope {
    public static void main(String[] args) {

        // Create context
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        // even though we are getting two beans, they are the same instance
        // because of the singleton scope
//        var database = context.getBean(Database.class);
//        var database2 = context.getBean(Database.class);
//
//        System.out.println("Database 1 connected: " + database.connect());
//        System.out.println("Database 2 connected: " + database2.connect());
//
//        if (database == database2) {
//            System.out.println("Database 1 == Database 2");
//        } else {
//            System.out.println("Database 1 != Database 2");
//        }

        // Here these are two different bean instances because it's using
        // the prototype scope
        var session1 = context.getBean(Session.class);
        var session2 = context.getBean(Session.class);

        System.out.println("First session ID: " + session1.getSessionId());
        System.out.println("Second session ID: " + session2.getSessionId());

        context.close();
    }
}
