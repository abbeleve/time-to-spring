package org.example.group;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Student {

    private Roles role;
    private String name;
    private String surname;
    private Integer age;

    public Student(Roles role, String name, String surname, Integer age) {
        this.role = role;
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


}
