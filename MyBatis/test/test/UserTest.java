package test;

import java.io.InputStream;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import pojo.User;

public class UserTest {

	@Test
	public void testFindUserById() throws Exception{
		String resource = "SqlMapConfig.xml";
		//通过流将核心配置文件读取进来
		InputStream inputStream = Resources.getResourceAsStream(resource);
		//通过核心配置文件输入流来创建会话工厂
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		//通过工厂创建会话
		SqlSession openSession = factory.openSession();
		//第一个参数：所调用的SQL语句(User.xml文件中的namespace属性和select语句中的id属性值)namespace+.+sql的id值
		User user = openSession.selectOne("test.findUserById", 1);
		System.out.println(user);
		openSession.close();
	}
	
	@Test
	public void testFindUserByUserName() throws Exception{
		String resource  = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession openSession = factory.openSession();
		
		List<User> list = openSession.selectList("test.findUserByUserName", "%王%");
		System.out.println(list);
		openSession.close();
	}
	
	
	@Test
	public void testInsertUser() throws Exception{
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession openSession = factory.openSession();
		
		User user = new User();
		user.setId(6);
		user.setUsername("Winston");
		user.setBirthday(new Date());
		user.setSex("男");
		user.setAddress("深圳");
		
		openSession.insert("test.insertUser", user);
		//提交事务(mybatis会自动开启事务，但是它不知道何时提交，所以需要手动设置)
		openSession.commit();
		
		System.out.println("==="+user.getId());
	}
	
	@Test
	public void testDelUserById() throws Exception{
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession openSession = factory.openSession();
		openSession.delete("test.delUserById", 6);
		openSession.commit();
	}
	
	
	@Test
	public void testUpdateUserById() throws Exception{
		String resource = "SqlMapConfig.xml";
		InputStream inputStream = Resources.getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		SqlSession openSession = factory.openSession();
		
		User user = new User();
		user.setId(6);
		user.setUsername("lu");
		openSession.update("test.updateUserById", user);
		openSession.commit();
	}
}
