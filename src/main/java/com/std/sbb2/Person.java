package com.std.sbb2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
public class Person {
    private int id;
    private String name;
    private int age;

    public Person(int lastId, String name, int age) {
        this.id = lastId;
        this.name = name;
        this.age = age;
    }
}
