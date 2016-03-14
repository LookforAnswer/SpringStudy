package com.qxy.spring.beans.factorybean;

import org.springframework.beans.factory.FactoryBean;

//��Ҫʵ��spring�ṩ�Ľӿ�    FactoryBean<Car> ,�����Carָ���Ƿ��ص�bean������
public class CarFactoryBean implements FactoryBean<Car> {

	private String brand;
	
	public void setBrand(String brand){
		this.brand = brand;
	}
	
	//����bean�Ķ���
	@Override
	public Car getObject() throws Exception {
		//������������
		return new Car("BMW", 500000);
	}

	/**
	 * ����bean������
	 */
	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	//�ǲ��ǵ�ʵ����
	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

}
