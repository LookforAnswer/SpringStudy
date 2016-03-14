package com.qxy.spring.aop;

public class Main {
	public static void main(String[] args) {
		ArithmeticCalculator  target = new ArithmeticCalculatorImp();
		ArithmeticCalculator proxy = new ArithmeticCalculatorLoggingImp();
		
		int result = proxy.add(1, 2);
		System.out.println("-->" + result);
	
		result = proxy.div(4, 2);
		System.out.println("-->" + result);
	}
}

