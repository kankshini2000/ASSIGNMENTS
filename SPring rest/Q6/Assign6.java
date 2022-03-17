package com.springbootbasics.springbootin10steps;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Assign6 {
	@RequestMapping(value = "/Add", method = RequestMethod.GET)
	public String Add(@RequestParam int a, @RequestParam int b) {
		long sum = a + b;
		return "Sum is " + sum;
	}

	@RequestMapping(value = "/Sub", method = RequestMethod.GET)
	public String Sub(@RequestParam int a, @RequestParam int b) {
		long sub = a - b;
		return "diff  is " + sub;
	}
	
	@RequestMapping(value = "/Div", method = RequestMethod.GET)
	public String Div(@RequestParam int a, @RequestParam int b) {
		long div = a / b;
		return "div is " + div;
	}

	@RequestMapping(value = "/Mul", method = RequestMethod.GET)
	public String Mul(@RequestParam int a, @RequestParam int b) {
		long mult = a * b;
		return "Mult is " + mult;
	}

}
