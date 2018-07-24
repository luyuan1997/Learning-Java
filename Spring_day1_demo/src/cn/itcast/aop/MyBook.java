package cn.itcast.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyBook {

	public void before1() {
		System.out.println("前置增强......");
	}
	
	public void after1() {
		System.out.println("后置增强......");
	}
	
	
	public void around1(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
		System.out.println("方法之前执行");
		
		proceedingJoinPoint.proceed();
		
		System.out.println("方法之后执行");
	}
}
