package cn.itcast.anno;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.itcast.xmlanno.BookService;

public class TestAnno {
	
//	@Test
//	public void testService() {
//		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
//		UserService userService = (UserService) context.getBean("userService");
//		userService.add();
//	}
	
	
	@Test
	public void testUser() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		User user = (User) context.getBean("user");
		System.out.println(user);
		user.add();
	}
	
	@Test
	public void testService() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");
		BookService bookService = (BookService) context.getBean("bookService");
		bookService.add();
	}
}
