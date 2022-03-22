package com.example.demo.repos;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Product;

public interface Productrepos extends MongoRepository<Product, String>{
	public Product findByName(String name);

	public List<Product> findByCost(float cost);

	public List<Product> findByDate(String date);
}
