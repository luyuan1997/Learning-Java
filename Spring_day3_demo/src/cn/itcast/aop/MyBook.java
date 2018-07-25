package cn.itcast.aop;

import org.aspectj.lang.annotation.Aspect;

import org.aspectj.lang.annotation.Before;

@Aspect
public class MyBook {

	@Before(value="execution(* cn.itcast.aop.Book.*(..))")
	public void before1() {
		System.out.println("before......");
	}
}
