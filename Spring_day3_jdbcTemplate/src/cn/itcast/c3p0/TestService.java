package cn.itcast.c3p0;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {

	@Test
	public void testDemo() {
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		UserService service = (UserService) context.getBean("userService");
		service.add();
	}
}
