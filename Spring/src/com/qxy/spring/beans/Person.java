package com.qxy.spring.beans;

public class Person {
	private String name;
	private int age;
	private Car car;
	
	//需要注意一点，如果是基本类型，那么系统会默认添加get和set方法，
	//但是如果不是基本类型，那么需要手动添加get和set方法，不然配置文件中识别不了这个属性，也就注入不了
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, Car car) {
		super();
		this.name = name;
		this.age = age;
		this.car = car;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", car=" + car + "]";
	}
	
}
