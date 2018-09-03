package com.itcast.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.junit.Test;

import com.itcast.domain.Person;

public class Demo {
	@Test
	public void f1() throws Exception {
		
		//获取class对象
		Class clazz = Class.forName("com.itcast.domain.Person");
		//获取构造器
		Constructor con = clazz.getConstructor();
		Person p = (Person) con.newInstance();
		//获取有参构造器
		Constructor con2 = clazz.getConstructor(String.class,String.class);
		Person p2 = (Person) con2.newInstance("tom","123");
		System.out.println(p.getPassword());
	}
	@Test
	public void f3() throws Exception {
		//获取class对象
		Class clazz = Class.forName("com.itcast.domain.Person");
		Person p = (Person) clazz.newInstance();
		//2.获取方法
		//2.1只可以用来获取公共方法
		Method m1 = clazz.getMethod("eat");
		//2.2可用来获取私有以及公共方法
		Method m2 = clazz.getDeclaredMethod("sleep");
		//2.3 若是私有方法，必须将其设置为可访问
		m2.setAccessible(true);
		//执行方法
		m1.invoke(p);
		m2.invoke(p);
	}
	
	@Test
	public void f4() throws Exception {
		//获取class对象
		Class clazz = Class .forName("com.itcast.domain.Person");
		Person p = (Person) clazz.newInstance();
		//获取方法
		Method m = clazz.getDeclaredMethod("sleep", String.class);
		//设置方法可以进行访问
		m.setAccessible(true);
		//执行方法
		String result = (String) m.invoke(p, "tom");
		System.out.println(result);
	}
}
