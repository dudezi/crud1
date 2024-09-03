package com.std.sbb2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    HomeController () {}

    @GetMapping("/home/main")
    @ResponseBody
    public String showMain () {
        return "안녕하세요.";
    }
    @GetMapping("/home/main2")
    @ResponseBody
    public String showMain2 () {
        return "반갑습니다.";
    }
    @GetMapping("/home/main3")
    @ResponseBody
    public String showMain3 () {
        return "즐거웠습니다.";
    }


}
