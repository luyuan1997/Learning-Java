package com.imooc.ioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIOC {
	@Test
	public void testUser() {
		//加载spring配置文件，根据创建对象
		@SuppressWarnings("resource")
		ApplicationContext context = new ClassPathXmlApplicationContext("Bean1.xml");
		//得到配置创建的对象
		User user=(User)context.getBean("user");
		System.out.println(user);
		user.add();
	}
	
}
