package com.qxy.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
/*		//创建HelloWorld的一个对象
		HelloWorld helloWorld = new HelloWorld();
		//为name赋值
		helloWorld.setName("hello:qxy");
*/
		
		//1.创建Spring 的IOC 容器对象
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
		
		//2.从IOC 容器红获取Bean 实例
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		//调用hello方法
		helloWorld.hello();
		
		
		
		//通过参数的个数和参数的类型来寻找到相应的构造函数
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		car = (Car) ctx.getBean("car2");
		System.out.println(car);
		
		
		//通过ref属性或ref标签来引用容器中的其他的bean对象
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
		
		person = (Person) ctx.getBean("person2");
		System.out.println(person);
		
	}
}
