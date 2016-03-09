package com.qxy.spring.beans.collections;

import java.util.Map;

import com.qxy.spring.beans.Car;

public class NewPerson {
	private String name;
	private int age;
	private Map<String,Car> cars;
	
	//需要注意一点，如果是基本类型，那么系统会默认添加get和set方法，
	//但是如果不是基本类型，那么需要手动添加get和set方法，不然配置文件中识别不了这个属性，也就注入不了
	

	public String getName() {
		return name;
	}

	public Map<String, Car> getCars() {
		return cars;
	}

	public void setCars(Map<String, Car> cars) {
		this.cars = cars;
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

	
	public NewPerson() {
		super();
		// TODO Auto-generated constructor stub
	}


	
	public NewPerson(String name, int age, Map<String, Car> cars) {
		super();
		this.name = name;
		this.age = age;
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "NewPerson [name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}

	
	
}
