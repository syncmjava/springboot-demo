package com.example.demo.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloApiController {
    @RequestMapping("/helloapp")
    public String helloApi() {
        String str = "hello Api, SpringBoot 9001!";

        return str;
    }
}
