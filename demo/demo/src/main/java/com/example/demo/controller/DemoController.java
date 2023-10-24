package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController {

    @GetMapping(value = "/wish")
    public void greeting() {
        System.out.println("Welcome to spring boot");

    }
}
