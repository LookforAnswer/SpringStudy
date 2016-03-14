package com.qxy.spring.beans.cycle;

public class Car {
	public Car(){
		System.out.println("Car's Contructor...");
	}
	
	private String brand;
	public void setBrand(String brand){
		System.out.println("setBrand...");
		this.brand = brand;
	}
	
	public void init(){
		System.out.println("init...");
	}
	
	@Override
	public String toString() {
		return "Car [brand=" + brand + "]";
	}

	public void destroy(){
		System.out.println("destroy...");
	}
	
	
}
