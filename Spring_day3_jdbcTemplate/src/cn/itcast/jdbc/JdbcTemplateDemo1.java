package cn.itcast.jdbc;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import java.sql.*;

public class JdbcTemplateDemo1 {

	//删除操作
			@Test
			public void delete() {
				//设置数据库信息
				DriverManagerDataSource dataSource = new DriverManagerDataSource();
//				dataSource.setDriverClassName("com.mysql.jbdc.Driver");
				dataSource.setUrl("jdbc:mysql:///spring_day3");
				dataSource.setUsername("root");
				dataSource.setPassword("lu910208");
				
				//创建jdbcTemplate对象，设置数据源
				JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
				
				//调用jdbcTemplate对象里面的方法实现update操作
				String sql = "delete from user where username=?";
				int rows = jdbcTemplate.update(sql,"lucy");
				System.out.println(rows);
			}
			
			
	
	//修改操作
		@Test
		public void update() {
			//设置数据库信息
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
//			dataSource.setDriverClassName("com.mysql.jbdc.Driver");
			dataSource.setUrl("jdbc:mysql:///spring_day3");
			dataSource.setUsername("root");
			dataSource.setPassword("lu910208");
			
			//创建jdbcTemplate对象，设置数据源
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			
			//调用jdbcTemplate对象里面的方法实现update操作
			String sql = "update user set password=? where username=?";
			int rows = jdbcTemplate.update(sql, "1314","lucy");
			System.out.println(rows);
		}
		
		
	//添加操作
	@Test
	public void add() {
		//设置数据库信息
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName("com.mysql.jbdc.Driver");
		dataSource.setUrl("jdbc:mysql:///spring_day3");
		dataSource.setUsername("root");
		dataSource.setPassword("lu910208");
		
		//创建jdbcTemplate对象，设置数据源
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		//调用jdbcTemplate对象里面的方法实现操作
		//创建sql语句
		String sql = "insert into user values(?,?)";
		int rows = jdbcTemplate.update(sql, "lucy","250");
		System.out.println(rows);
	}
}
