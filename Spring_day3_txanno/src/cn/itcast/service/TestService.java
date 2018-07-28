package cn.itcast.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestService {

	@Test
	public void TestDemo(){
		ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
		OrdersService service = (OrdersService) context.getBean("ordersService");
		service.accountMoney();
	}
}
