package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Orders {
	@Id
	String oid;
	String item;
	long quantity;
	long price;
	public String getOid() {
		return oid;
	}
	public void setOid(String oid) {
		this.oid = oid;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public Orders(String oid, String item, long quantity, long price) {
		super();
		this.oid = oid;
		this.item = item;
		this.quantity = quantity;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Orders [oid=" + oid + ", item=" + item + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
}
