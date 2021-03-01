package com.example.jenkinsdemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class HelloController {

    @RequestMapping("/one")
    public String test1(){

        return "hello";
    }

    @RequestMapping("/two")
    public String test2(){
        System.out.println("two");
        return "hello";
    }
}
