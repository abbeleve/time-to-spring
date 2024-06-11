package org.example.jsons;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class newcomer {
    private int age;
    private String name;
    private String surname;

    public newcomer (int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

}
