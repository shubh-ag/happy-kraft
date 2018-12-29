package com.happy.kraft.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping(value="/test")
    public String testMethod(){
        return "HELLO WORLD! I am working :)";
    }
}
