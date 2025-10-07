package com.viv.spring_security.controller;

import com.viv.spring_security.model.Users;
import com.viv.spring_security.services.MyUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {


    @GetMapping("/")
    public String demo(){
        return "hello";
    }


}
