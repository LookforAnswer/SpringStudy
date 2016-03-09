package com.qxy.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
/*		//����HelloWorld��һ������
		HelloWorld helloWorld = new HelloWorld();
		//Ϊname��ֵ
		helloWorld.setName("hello:qxy");
*/
		
		//1.����Spring ��IOC ��������
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		
		
		//2.��IOC �������ȡBean ʵ��
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		//����hello����
		helloWorld.hello();
		
		
		
		//ͨ�������ĸ����Ͳ�����������Ѱ�ҵ���Ӧ�Ĺ��캯��
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		car = (Car) ctx.getBean("car2");
		System.out.println(car);
		
		
		//ͨ��ref���Ի�ref��ǩ�����������е�������bean����
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);
		
		person = (Person) ctx.getBean("person2");
		System.out.println(person);
		
	}
}
