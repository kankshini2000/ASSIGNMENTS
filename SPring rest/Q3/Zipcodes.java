package com.Mongodb.Examples;

import java.util.ArrayList;

public class Zipcodes {
	long zipcode;
	String state;
	String city;
	String cntry;
	public long getZipcode() {
		return zipcode;
	}
	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCntry() {
		return cntry;
	}
	public void setCntry(String cntry) {
		this.cntry = cntry;
	}
	public Zipcodes(long zipcode, String state, String city, String cntry) {
		super();
		this.zipcode = zipcode;
		this.state = state;
		this.city = city;
		this.cntry = cntry;
	}
	@Override
	public String toString() {
		return "Zipcodes [zipcode=" + zipcode + ", state=" + state + ", city=" + city + ", cntry=" + cntry + "]";
	}	
}
