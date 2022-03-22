package com.example.demo.repos;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.demo.model.Orders;

public interface Oderrepos extends MongoRepository<Orders, String>{
	
	public Orders findByitem(String item);

	public List<Orders> findByprice(long price);

	public List<Orders> findByquantity(long quantity);
}
