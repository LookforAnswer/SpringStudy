package com.qxy.spring.beans.spel;

public class Address {
	private String city;
	private String Street;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getStreet() {
		return Street;
	}
	public void setStreet(String street) {
		Street = street;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", Street=" + Street + "]";
	}
	
}
