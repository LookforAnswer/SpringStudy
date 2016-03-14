package com.qxy.spring.beans.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
		
		System.out.println("postProcessAfterInitialization��" + arg0 + ", " + arg1);
		Car car = new Car();
		car.setBrand("ford");
		return car;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
		
		//��Ϊ���ô������Ƕ����ж�bean,���в���
		if("car".equals(arg1)){
			//...
		}
		
		System.out.println("postProcessBeforeInitialization:"+ arg0 + ", " + arg1);
		
		return arg0;
	}

}
