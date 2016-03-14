package com.qxy.spring.beans.spel;

public class Car {
	private String brand;
	private double price;
	
	private double tyreperimeter;
	
	public double getTyreperimeter() {
		return tyreperimeter;
	}
	public void setTyreperimeter(double tyreperimeter) {
		this.tyreperimeter = tyreperimeter;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Car [brand=" + brand + ", price=" + price + ", tyreperimeter=" + tyreperimeter + "]";
	}
	
}
