package com.example.demo.repos;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Customer;

@Repository

public interface Customerrepos  extends MongoRepository<Customer, String>{
	public Customer findByFirstName(String fname, String lname);
}
