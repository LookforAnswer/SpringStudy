package com.qxy.spring.beans.collections;

import java.util.List;

import com.qxy.spring.beans.Car;

public class Person {
	private String name;
	private int age;
	private List<Car> cars;
	
	//��Ҫע��һ�㣬����ǻ������ͣ���ôϵͳ��Ĭ�����get��set������
	//����������ǻ������ͣ���ô��Ҫ�ֶ����get��set��������Ȼ�����ļ���ʶ����������ԣ�Ҳ��ע�벻��
	
	public List<Car> getCars() {
		return cars;
	}

	public void setCars(List<Car> cars) {
		this.cars = cars;
	}

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

	
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person(String name, int age, List<Car> cars) {
		super();
		this.name = name;
		this.age = age;
		this.cars = cars;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", cars=" + cars + "]";
	}
	
	
}
