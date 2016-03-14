package com.qxy.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 
 * 实力工厂方法： 实例工厂，及现需要创建工厂本身，在调用工厂的实力方法来返回bean 的实例
 *
 */
public class InstanceCarFactory {
	private Map<String,Car> cars = null;
	
	public InstanceCarFactory(){
		cars = new HashMap<String,Car>();
		cars.put("audi",new Car("audi",300000));
		cars.put("ford",new Car("ford",400000));
	}
	
	public Car getCar(String brand){
		return cars.get(brand);
	}
}
