package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.UserModel;
import com.example.demo.service.Userservice;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("api/v1/users/")
public class UserController {
    
    @Autowired
    private Userservice userservice;

    @PostMapping
    public String postUser(@RequestBody UserModel user) {
        return userservice.insertUser(user);
    }
    @GetMapping
    public String getMethodName(@RequestParam String param) {
        return new String();
    }
    
}
