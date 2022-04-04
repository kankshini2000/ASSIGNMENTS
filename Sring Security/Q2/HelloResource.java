package com.springsecurity.SpringsecurityDemos.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloResource {
	@GetMapping("/home")
    public String Home(){
        return "Welcome to home page";
    }

    @GetMapping("/user")
    public  String getUser(){
        return "Welcome user";
    }

    @GetMapping("/admin")
    public String getAdmin(){
        return "Welcome admin";
    }
	
}
