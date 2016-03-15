package com.qxy.spring.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * ****************************************************************************
 * @Package:      [com.qxy.spring.aop.LoggingAspect.java]  
 * @ClassName:    [LoggingAspect]   
 * @Description:  [可以使用 @order 注解指定切面的优先级，值越小优先级越高]   
 * @Author:       [QinXiaoYun]  
 * @CreateDate:   [2016年3月14日 下午4:05:13]   
 * @UpdateUser:   [qxy(如多次修改保留历史记录，增加修改记录)]   
 * @UpdateDate:   [2016年3月14日 下午4:05:13，(如多次修改保留历史记录，增加修改记录)]   
 * @UpdateRemark: [说明本次修改内容,(如多次修改保留历史记录，增加修改记录)]  
 * @Version:      [v1.0]
 */
@Order(2)
@Aspect
@Component
public class LoggingAspect {

	/**
	 * 
	 * @Title: declareJoinPointExpression
	 * @Description: 定义一个方法，用于声明切入点表达式，一般地，该方法再不需要填入其他的代码
	 * 				 使用@Pointcut 来声明切入点表达式
	 * @param     设定文件
	 * @return void    返回类型
	 * @throws
	 */
	@Pointcut("execution(public int  com.qxy.spring.aop.ArithmeticCalculator.*(..))")
	public void declareJoinPointExpression(){}
	
	
	/**
	 * 
	 * @Title: beforeMethod
	 * @Description: 在  com.qxy.spring.aop.ArithmeticCalculator 接口的每一个实现类的每一个方法开始之前执行一段代码
	 * @param     设定文件
	 * @return void    返回类型
	 * @throws
	 */
	//@Before("execution(public int  com.qxy.spring.aop.ArithmeticCalculator.*(..))")
	@Before("declareJoinPointExpression()")
	public void beforeMethod(JoinPoint joinPoint){
		String methodName = joinPoint.getSignature().getName();
		Object [] args = joinPoint.getArgs();
		
		System.out.println("The method " +methodName+ " begins with " + Arrays.asList(args));
	}
	
	
	/**
	 * 
	 * @Title: beforeMethod
	 * @Description: 在  com.qxy.spring.aop.ArithmeticCalculator 接口的每一个实现类的每一个方法开始之前执行一段代码
	 * @param     设定文件
	 * @return void    返回类型
	 * @throws
	 */
	@After("declareJoinPointExpression()")
	public void afterMethod(JoinPoint joinPoint){
		String methodName = joinPoint.getSignature().getName();
		System.out.println("The method " +methodName+ " ends ");
	}
	
	
	/**
	 * 
	 * @Title: afterReturning
	 * @Description: 在方法正常结束后执行的代码
	 * 				  返回通知是可以访问到方法的返回值的！
	 * @param @param joinPoint    设定文件
	 * @return void    返回类型
	 * @throws
	 */
	@AfterReturning(value="declareJoinPointExpression()",
			returning="result")
	public void afterReturning(JoinPoint joinPoint,Object result){
		String methodName = joinPoint.getSignature().getName();
		System.out.println("The method " +methodName+ " ends with "+ result);
	}
	
	/**
	 * 
	 * @Title: afterThrowing
	 * @Description: 在目标方法出现异常时会执行的代码
	 * 				 可以访问到异常对象；且可以指定在出现特定异常时再执行通知代码
	 * @param @param joinPoint
	 * @param @param ex    设定文件
	 * @return void    返回类型
	 * @throws
	 */
	@AfterThrowing(value="declareJoinPointExpression()",
			throwing="ex")
	public void afterThrowing(JoinPoint joinPoint,NullPointerException ex){
		String methodName = joinPoint.getSignature().getName();
		System.out.println("The method " +methodName+ " occurs exection:"+ ex);
	}
	
	/**
	 * 
	 * @Title: aroundMthod
	 * @Description: 环绕通知需要携带  ProcedingJoinPoint 类型的参数，
	 * 				   环绕通知类似于动态代理的全过程：ProcedingJoinPoint 类型的参数可以决定是否执行目标方法
	 * @param     设定文件
	 * @return void    返回类型
	 * @throws
	 */
	/*@round("execution(public int  com.qxy.spring.aop.ArithmeticCalculator.*(..))");
	public void aroundMthod(ProcessJ){
		
	}*/
	
}
