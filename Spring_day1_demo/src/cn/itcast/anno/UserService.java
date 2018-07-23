package cn.itcast.anno;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value="userService")
public class UserService {
	
	//得到dao对象
	//1.定义dao类型属性
	//在dao属性上面使用注解 弯沉对象注入
//	@Autowired
//	private UserDao userDao;
	//使用注解方式不需要set方法
	
	@Resource(name="userDao")
	private UserDao userDao;

	public void add() {
		System.out.println("service......");
		userDao.add();
	}
}
