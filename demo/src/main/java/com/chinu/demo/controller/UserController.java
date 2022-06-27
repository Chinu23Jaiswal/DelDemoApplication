package com.chinu.demo.controller;

import com.chinu.demo.dto.Users;
import com.chinu.demo.repository.UserRepo;
import com.chinu.demo.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.config.ConfigDataResourceNotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private UserService userService;

    @GetMapping
    public List<Users> getAllUser(){
        return userRepo.findAll();
    }

    @PostMapping
    public Users addUser(@RequestBody Users users){
        return userService.saveUser(users);
    }



}
