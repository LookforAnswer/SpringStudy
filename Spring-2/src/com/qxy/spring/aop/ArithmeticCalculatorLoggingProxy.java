package com.qxy.spring.aop;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;
import java.lang.reflect.InvocationHandler;


public class ArithmeticCalculatorLoggingProxy {

	private ArithmeticCalculator target;
	
	public ArithmeticCalculator getLoggingProxy(){
		
		ArithmeticCalculator proxy = null;
		
		//代理对象由哪一个类加载器负责加载
		ClassLoader loader = target.getClass().getClassLoader();
		//代理对象的类型，即其中有哪些方法
		Class [] interfaces = new Class[]{ArithmeticCalculator.class};
		
		//当调用代理对象其中的方法时，该执行的代码
		java.lang.reflect.InvocationHandler h = new InvocationHandler(){

			/**
			 * arg0: 正在返回的那个代理对象，一般情况下，在invoke 方法中都不使用该对象
			 * arg1: 正在被调用的方法
			 * args: 调用方法时，传入的参数
			 */
			@Override
			public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
				String methodName = arg1.getName();
				//日志
				System.out.println("The Method " + methodName + " begins with " + Arrays.asList(arg2));
				//执行方法
				Object result = arg1.invoke(target, arg2);
				//日志
				System.out.println("The method " + methodName + "end with " + result);
				return 0;
			}
		};
		
		proxy =(ArithmeticCalculator) Proxy.newProxyInstance(loader, interfaces, h);
		return proxy;
	}
}