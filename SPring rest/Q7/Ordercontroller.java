package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Orders;
import com.example.demo.service.Orderservice;



@RestController
public class Ordercontroller {
	@Autowired
	private Orderservice orderser;

	@PostMapping("/place")
	public String place(@RequestParam String item, @RequestParam long quantity, @RequestParam long price) {
		Orders o1 = orderser.place(item, quantity, price);
		return o1.toString();
	}

	@GetMapping("/showByitem")
	public Orders getByItem(@RequestParam String item) {
		return orderser.getByItem(item);
	}

	@GetMapping("/show")
	public List<Orders> getAll() {
		return orderser.getAll();
	}

	@GetMapping("/showByprice")
	public List<Orders> getByPrice(@RequestParam long price) {
		return orderser.getByPrice(price);
	}

	@PutMapping("/update")
	public String update(@RequestParam String item, @RequestParam long quantity, @RequestParam long price) {
		Orders o1 = orderser.update(item, quantity, price);
		return o1.toString();
	}

	@DeleteMapping("/deleteByItem")
	public void deleteByItem(@RequestParam String item) {
		orderser.deleteByItem(item);
		System.out.println("Deleted Item : " + item);
	}

	@DeleteMapping("/delete")
	public void deleteAll() {
		orderser.deleteAll();
		System.out.println("Deleted all orders");
	}
}
