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
    PersonController () {
        people = new ArrayList<>();
    }

    @GetMapping("/person/add")
    @ResponseBody
    public String addPerson (@RequestParam ("name") String name, @RequestParam ("age") int age) {
        Person p = new Person(name, age);
        people.add(p);
        return String.format("%d번 사람이 추가되었습니다.", p.getId());
    }


}
