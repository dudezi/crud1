package com.std.sbb2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PersonController {
    List<Person> people;
    int lastId;
    PersonController () {
        lastId = 0;
        people = new ArrayList<>();
    }

    @GetMapping("/person/add")
    @ResponseBody
    public String addPerson (@RequestParam ("name") String name, @RequestParam ("age") int age) {
        lastId++;
        Person p = new Person(lastId, name, age);
        people.add(p);
        return String.format("%d번 사람이 추가되었습니다.", p.getId());
    }

    @GetMapping("/person/people")
    @ResponseBody
    public List<Person> showPeople () {
        return people;
    }
}
