package com.viv.spring_security.controller;

import com.viv.spring_security.model.Users;
import com.viv.spring_security.services.MyUserDetailsService;
import com.viv.spring_security.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Controller {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<Users> user(){
        List<Users> users = userService.getUsers();
        return users;
    }

    @PostMapping("/register")
    public Users register(@RequestBody Users user){
        userService.saveUser(user);
        return user;
    }




}
