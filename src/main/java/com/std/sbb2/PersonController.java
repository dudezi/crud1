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
    public List<Person> showPerson () {
        return people;
    }

    @GetMapping("/person/remove")
    @ResponseBody
    public String removePerson (@RequestParam ("id") int id) {
        Person p = _findByPerson(id);

        if (p == null) {
            return id + "번 사람이 존재하지 않습니다.";
        }
        people.remove(p);
        return id + "번 사람이 삭제되었습니다.";
    }

    @GetMapping("/person/modify")
    @ResponseBody
    public String modifyPerson (@RequestParam ("id") int id, @RequestParam("name") String name, @RequestParam("age") int age) {
        Person p = _findByPerson(id);

        if (p == null) {
            return id + "번 사람이 존재하지 않습니다.";
        }
        people.get(id - 1).setName(name);
        people.get(id - 1).setAge(age);
        return id + "번 사람이 수정되었습니다.";
    }

    private Person _findByPerson (int id) {
        Person p = null;
        for (int i = 0; i < people.size(); i++) {
            if (people.get(i).getId() == id) {
                p = people.get(i);
            }
        }
        return p;
    }
}

