package com.practice.mcy5.rest;

import com.practice.mcy5.model.User;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

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

    @GetMapping("/users/{userId}")
    public void getUserById(@PathVariable("userId") UUID userId){
        List<User> usersList = new ArrayList<>();
        for(User user : usersList){
            if(userId.equals(user.getUserId())){
                System.out.println("User found : " + user.getFirstName());
                break;
            }
        }
    }

    @PostMapping("/users")
    public void setUser(@Valid @RequestBody User user){
        System.out.println(user.toString());
    }

}
