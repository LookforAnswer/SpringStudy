package com.qxy.spring.beans.factorybean;

import org.springframework.beans.factory.FactoryBean;

//需要实现spring提供的接口    FactoryBean<Car> ,这里的Car指的是返回的bean的类型
public class CarFactoryBean implements FactoryBean<Car> {

	private String brand;
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	
	//返回bean的对象
	@Override
	public Car getObject() throws Exception {
		//会调用这个方法
		return new Car("BMW", 500000);
	}

	/**
	 * 返回bean的类型
	 */
	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	//是不是单实例的
	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

}
