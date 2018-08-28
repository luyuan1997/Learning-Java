package cn.itcast.reflect;

import java.lang.reflect.Method;

import org.junit.Test;

public class Demo {

	@Test
	public void f1() {
		//调用HelloMyServlet中的方法
		HelloMyServlet a = new HelloMyServlet();
		a.add();
		a.add(10, 20);
	}
	
	@Test
	public void f2() throws Exception {
		Class newClass = Class.forName("cn.itcast.reflect.HelloMyServlet");
		//通过字节码对象创建一个实例对象(相当于调用实参构造器)
		HelloMyServlet a = (HelloMyServlet) newClass.newInstance();
		a.add();
	}
	
	@Test
	public void f3() throws Exception {
		Class newClass = Class.forName("cn.itcast.reflect.HelloMyServlet");
		//通过字节码对象创建一个实例对象(相当于调用实参构造器)
		HelloMyServlet a = (HelloMyServlet) newClass.newInstance();
		//获取方法对象
		Method method = newClass.getMethod("add");
		//让方法对象执行  obj调用这个方法的实例
		method.invoke(a);
	}
	
	@Test
	public void f4() throws Exception, Exception {
		Class newClass = HelloMyServlet.class;
		HelloMyServlet a = (HelloMyServlet) newClass.newInstance();
		Method m = newClass.getMethod("add", int.class, int.class);
		m.invoke(a, 10,20);
	}
}
