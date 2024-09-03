package com.std.sbb2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Person {
    private int lastId = 0;
    private int id;
    private String name;
    private int age;

    Person (String name, int age) {
        lastId++;
        this.id = lastId;
        this.name = name;
        this.age = age;
    }
}
