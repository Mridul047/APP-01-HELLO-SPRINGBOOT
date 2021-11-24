package com.practice.mcy5.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/greeting")
    public String greetUser(){
        return "Hello user , the time right now is " + new Date();
    }

}
