package com.drools.DemoApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet() {
        System.out.println("im here");
        return "Welcome to the party!!";
    }

    @RequestMapping("/about")
    public String about() {
        return "About Page";
    }
}
