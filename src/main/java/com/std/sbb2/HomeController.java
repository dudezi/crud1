package com.std.sbb2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {
    private int number;

    HomeController () {
        number = -1;
    }

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

    @GetMapping("/home/increase")
    @ResponseBody
    public int showIncrease () {
        number++;
        return number;
    }

    @GetMapping("/home/plus")
    @ResponseBody
    public int plus(@RequestParam(value = "a", defaultValue = "0") int a, @RequestParam(value = "b", defaultValue = "0") int b){
        return a + b;
    }

    @GetMapping("/home/minus")
    @ResponseBody
    public int minus(@RequestParam(value = "a", defaultValue = "0") int a, @RequestParam(value = "b", defaultValue = "0") int b){
        return a - b;
    }

    @GetMapping("/home/divide")
    @ResponseBody
    public int divide(@RequestParam(value = "a", defaultValue = "0") int a, @RequestParam(value = "b", defaultValue = "0") int b){
        return a / b;
    }

    @GetMapping("/home/multiply")
    @ResponseBody
    public int multiply(@RequestParam(value = "a", defaultValue = "0") int a, @RequestParam(value = "b", defaultValue = "0") int b){
        return a * b;
    }
}