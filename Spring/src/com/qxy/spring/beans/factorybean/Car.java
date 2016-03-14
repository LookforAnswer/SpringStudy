package com.qxy.spring.beans.factorybean;

public class Car {
	public Car(){
		System.out.println("Car's Contructor...");
	}
	
	private String brand;
	private double price;
	public Car(String brand, double price) {
		super();
		this.brand = brand;
		this.price = price;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand){
		System.out.println("setBrand...");
		this.brand = brand;
	}
	
	public void init(){
		System.out.println("init...");
	}
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + "]";
	}

	public void destroy(){
		System.out.println("destroy...");
	}
	
	
}
