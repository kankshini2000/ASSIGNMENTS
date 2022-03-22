package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Product;
import com.example.demo.service.Productservice;


@RestController
public class Productcontroller {
	@Autowired
	private Productservice productser;

	@PostMapping("/order")
	public String order(String name, float cost, String Date) {
		Product product = productser.orderProduct(name, cost, Date);
		return product.toString();
	}

	@GetMapping("/getOrderbyName")
	public Product findbyName(String name) {
		return productser.findbyName(name);
	}

	@GetMapping("/getAllOrders")
	public List<Product> findAll() {
		return productser.findAll();
	}

	@GetMapping("/getOrderbyPrice")
	public List<Product> findByPrice(float cost) {
		return productser.findByCost(cost);
	}

	@GetMapping("/getOrderbyDate")
	public List<Product> findByDate(String date) {
		return productser.findByDate(date);
	}

	@PutMapping("/updateOrder")
	public String update(String name, float cost, String date) {
		Product p1 = productser.update(name, cost, date);
		return p1.toString();
	}

	@DeleteMapping("/deleteOrder")
	public void delete(String name) {
		productser.deleteByName(name);
	}
}
