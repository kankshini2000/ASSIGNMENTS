package com.springbootbasics.springbootin10steps;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Assign1Controller {
	@RequestMapping("/hello")
    public String hello() {
        return "Hello World RESTful with Spring Boot";
    } 
}
