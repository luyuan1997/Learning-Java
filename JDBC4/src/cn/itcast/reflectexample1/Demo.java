package cn.itcast.reflectexample1;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.junit.Test;

import cn.itcast.reflect.HelloMyServlet;

public class Demo {

	@Test
	public void f1() throws Exception {
		//定义一个map
		HashMap<String, String> map = new HashMap<>();
		//往map中放入一个值
		map.put("/hello", "cn.itcast.reflect.HelloMyServlet");
		//通过key获取value
		String value = map.get("/hello");
		//通过全限定名创建一个实例
		Class newClass = Class.forName(value);
		HelloMyServlet a = (HelloMyServlet) newClass.newInstance();
		//调用空参的add方法
		Method m = newClass.getMethod("add");
		m.invoke(a);
	}
	
	@Test
	public void f2() throws Exception {
		//解析xml
		//创建document对象
		Document doc = new SAXReader().read("C:\\Users\\lu\\Documents\\GitHub\\Learning-Java\\JDBC4\\xml\\web.xml");
		//通过xpath解析获取servlet-calss和url-pattern的标签体
		Element servletClass = (Element) doc.selectSingleNode("//servlet-class");
		Element urlPattern = (Element) doc.selectSingleNode("//url-pattern");
		String classText = servletClass.getText();
		String urlText = urlPattern.getText();
		
		//定义一个map
		HashMap<String, String> map = new HashMap<>();
		
		//将两个值放入到map中
		map.put(urlText, classText);
		//往map中放入一个值
		//map.put("/hello", "cn.itcast.reflect.HelloMyServlet");
		//通过key获取value
		String value = map.get("/hello");
		//通过全限定名创建一个实例
		Class newClass = Class.forName(value);
		HelloMyServlet a = (HelloMyServlet) newClass.newInstance();
		//调用空参的add方法
		Method m = newClass.getMethod("add");
		m.invoke(a);
	}
}
