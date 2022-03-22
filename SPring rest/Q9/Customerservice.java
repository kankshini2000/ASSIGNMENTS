package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repos.Customerrepos;


@Service
public class Customerservice {
	@Autowired
	private Customerrepos customerrepo;

	public Customer create(String fname, String lname, String street, String city, String state, String country,
			long zipcode) {
		return customerrepo.save(new Customer(fname, lname, street, city, state, country, zipcode));
	}

	public List<Customer> fetchAll() {
		return customerrepo.findAll();
	}

	public Customer fetchByName(String fname, String lname) {
		return customerrepo.findByFirstName(fname, lname);
	}

	public Customer update(String fname, String lname, String street, String city, String state, String country,
			long zipcode) {
		Customer customer = customerrepo.findByFirstName(fname, lname);
		customer.setCity(city);
		customer.setCountry(country);
		customer.setState(state);
		customer.setStreet(street);
		customer.setZipcode(zipcode);
		return customerrepo.save(customer);
	}

	public String deleteByName(String fname, String lname) {
		Customer customer = customerrepo.findByFirstName(fname, lname);
		customerrepo.delete(customer);
		return "Deleted Customer " + fname + " " + lname;
	}
}
