package cn.itcast.anno;

import org.springframework.stereotype.Component;

@Component(value = "user")  //采用注解创建对象,相当于<bean id="user" class=""/>,
public class User {

	public void add() {
		System.out.println("add......");
	}
}
