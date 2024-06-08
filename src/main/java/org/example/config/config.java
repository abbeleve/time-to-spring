package org.example.config;

import org.example.group.Roles;
import org.example.group.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("org.example.group")
public class config {
    @Bean
    public Student getElder() {
        return new Student(Roles.Elder, "Nikolay", "Bairbiliktuev", 20);
    }

    @Bean("GroupName")
    public String getGroupName() {
        return "ISIB22-1";
    }

    @Bean("PeopleInGroup")
    public int getGroupLength() {
        return 22;
    }
}
