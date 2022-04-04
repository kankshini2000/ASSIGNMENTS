package com.springsecurity.SpringsecurityDemos;


import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
/*
 * @EnableAutoConfiguration
 * 
 * @ComponentScan({"com.springsecurity.SpringsecurityDemos", "controller",
 * "service","util"})
 */
public class SpringsecurityDemosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringsecurityDemosApplication.class, args);
	}

}