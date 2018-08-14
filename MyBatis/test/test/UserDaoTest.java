package test;

import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Before;
import org.junit.Test;

import dao.UserDao;
import dao.UserDaoImpl;
import pojo.User;

public class UserDaoTest {

	private SqlSessionFactory factory;
	
	@Before
	public void setUp() throws Exception{
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
	}
	
	@Test
	public void testFindUserById() throws Exception{
		UserDao userDao = new UserDaoImpl(factory);
		
		User user = userDao.findUserById(1);
		
		System.out.println(user);
	}
	@Test
	public void testFindUserByUserName() throws Exception{
		UserDao userDao = new UserDaoImpl(factory);
		List<User> list = userDao.findUserByUserName("Íõ");
		System.out.println(list);
	}
}
