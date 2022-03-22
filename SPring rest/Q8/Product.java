package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Product {
	@Id
	String pid;
	String name;
	float cost;
	String Date;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getCost() {
		return cost;
	}
	public void setCost(float cost) {
		this.cost = cost;
	}
	public String getDate() {
		return Date;
	}
	public void setDate(String date) {
		Date = date;
	}
	public Product(String name, float cost, String date) {
		super();
		this.name = name;
		this.cost = cost;
		Date = date;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", cost=" + cost + ", Date=" + Date + "]";
	}
	
}
