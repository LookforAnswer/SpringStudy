package com.qxy.spring.aop;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.lang.reflect.InvocationHandler;


public class ArithmeticCalculatorLoggingProxy {

	private ArithmeticCalculator target;
	
	public ArithmeticCalculator getLoggingProxy(){
		
		ArithmeticCalculator proxy = null;
		
		//�����������һ����������������
		ClassLoader loader = target.getClass().getClassLoader();
		//�����������ͣ�����������Щ����
		Class [] interfaces = new Class[]{ArithmeticCalculator.class};
		
		//�����ô���������еķ���ʱ����ִ�еĴ���
		java.lang.reflect.InvocationHandler h = new InvocationHandler(){

			/**
			 * arg0: ���ڷ��ص��Ǹ��������һ������£���invoke �����ж���ʹ�øö���
			 * arg1: ���ڱ����õķ���
			 * args: ���÷���ʱ������Ĳ���
			 */
			@Override
			public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
				String methodName = arg1.getName();
				//��־
				System.out.println("The Method " + methodName + " begins with " + Arrays.asList(arg2));
				//ִ�з���
				Object result = arg1.invoke(target, arg2);
				//��־
				System.out.println("The method " + methodName + "end with " + result);
				return 0;
			}
		};
		
		proxy =(ArithmeticCalculator) Proxy.newProxyInstance(loader, interfaces, h);
		return proxy;
	}
}