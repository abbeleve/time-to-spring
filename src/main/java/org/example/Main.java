package org.example;

import org.example.config.config;
import org.example.group.Group;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(config.class);

        Group ISIB = context.getBean(Group.class);
        System.out.println(ISIB.getDirector());
        System.out.println(ISIB.getGroupName());
    }
}
