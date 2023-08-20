package com.qayas.springbootdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @GetMapping("/demo")
    public String demo (@RequestParam("name") String identifier) {
        System.out.println("demo controller");
        return identifier;
    }
}
