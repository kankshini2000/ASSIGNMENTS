package com.example.demo.service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Product;
import com.example.demo.repos.Productrepos;

@Service
public class Productservice {
	@Autowired
	private Productrepos productrepo;

	public Product orderProduct(String name, float cost, String Date) {
		return productrepo.save(new Product(name, cost, Date));
	}

	public Product findbyName(String name) {
		return productrepo.findByName(name);
	}

	public List<Product> findAll() {
		return productrepo.findAll();
	}

	public List<Product> findByCost(float cost) {
		return productrepo.findByCost(cost);
	}

	public List<Product> findByDate(String date) {
		return productrepo.findByDate(date);
	}

	public Product update(String name, float cost, String date) {
		Product p1 = productrepo.findByName(name);
		p1.setCost(cost);
		p1.setDate(date);
		return productrepo.save(p1);
	}

	public String deleteAll() {
		productrepo.deleteAll();
		return "Products Deleted";
	}

	public String deleteByName(String name) {
		Product product = productrepo.findByName(name);
		productrepo.delete(product);
		return "Deleted Product " + name;
	}
}
