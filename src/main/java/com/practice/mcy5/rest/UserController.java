package com.practice.mcy5.rest;

import com.practice.mcy5.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @GetMapping("/greeting")
    public String greetUser(){
        return "Hello user , the time right now is " + new Date();
    }

    @GetMapping("/users")
    public List<User> getUsers(){
        List<User> usersList = new ArrayList<>();
        return usersList;
    }
}
