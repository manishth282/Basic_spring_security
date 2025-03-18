package com.company.tryspringsecurity.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/getUser")
    @PreAuthorize("hasRole('USER')")
    public String getUser(){
        return "Get user details";
    }
    @GetMapping("getAdmin")
    @PreAuthorize("hasRole('ADMIN')")
    public String getAdmin(){
        return "Get Admin details";
    }
}
