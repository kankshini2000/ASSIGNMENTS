package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Customer;
import com.example.demo.service.Customerservice;


@RestController
public class CustomerControler {
	@Autowired
	private Customerservice customerser;

	@PostMapping("/create")
	public String create(String fname, String lname, String street, String city, String state, String country,
			long zipcode) {
		Customer c1 = customerser.create(fname, lname, street, city, state, country, zipcode);
		return c1.toString();
	}

	@GetMapping("/fetchAll")
	public List<Customer> fetchAll() {
		return customerser.fetchAll();
	}

	@GetMapping("/fetchByName")
	public Customer fetchByName(String fname, String lname) {
		return customerser.fetchByName(fname, lname);
	}

	@PutMapping("/update")
	public String update(String fname, String lname, String street, String city, String state, String country,
			long zipcode) {
		Customer c1 = customerser.update(fname, lname, street, city, state, country, zipcode);
		return c1.toString();
	}

	@DeleteMapping("/delete")
	public void deleteByName(String fname, String lname) {
		customerser.deleteByName(fname, lname);
	}
}
