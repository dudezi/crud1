package com.std.sbb2;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@AllArgsConstructor
@Getter
@Setter
public class Person {
    private int id;
    private String name;
    private int age;

//    public Person (int id, String name, int age) {
//        this.id = id;
//        this.name = name;
//        this.age = age;
//    }
}
