package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Orders;
import com.example.demo.repos.Oderrepos;


@Service
public class Orderservice {
	@Autowired
	private Oderrepos orderrepo;

	// create operation
	public Orders place(String item, long quantity, long price) {
		return orderrepo.save(new Orders(item, quantity, price));
	}

	// Retrieve operations
	public Orders getByItem(String item) {
		return orderrepo.findByitem(item);
	}

	public List<Orders> getAll() {
		return orderrepo.findAll();
	}

	public List<Orders> getByPrice(long price) {
		return orderrepo.findByprice(price);
	}

	// update operations
	public Orders update(String item, long quantity, long price) {
		Orders o1 = orderrepo.findByitem(item);
		o1.setQuantity(quantity);
		o1.setPrice(price);
		return orderrepo.save(o1);
	}

	// Delete Operations
	public void deleteAll() {
		orderrepo.deleteAll();
	}

	public void deleteByItem(String item) {
		Orders order = orderrepo.findByitem(item);
		orderrepo.delete(order);
	}
}
