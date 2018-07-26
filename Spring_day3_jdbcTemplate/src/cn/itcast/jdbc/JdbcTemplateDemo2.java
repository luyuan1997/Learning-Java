package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;



public class JdbcTemplateDemo2 {
	
	
	//查询返回对象
		@Test
		public void testObject() {
			//设置数据库信息
			DriverManagerDataSource dataSource = new DriverManagerDataSource();
		//	dataSource.setDriverClassName("com.mysql.jbdc.Driver");
			dataSource.setUrl("jdbc:mysql:///spring_day3");
			dataSource.setUsername("root");
			dataSource.setPassword("lu910208");
					
			//创建jdbcTemplate对象，设置数据源
			JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
			//调用方法查询记录数
			String sql = "select * from user where username=?";
			//第二个参数需要自己写实现接口，自己做数据封装
			User user = jdbcTemplate.queryForObject(sql, new MyRowMapper(), "lucy");
			System.out.println(user);
			
		}
	
	
	
	
	//jdbc实现代码
	@Test
	public void testJDBC(){
		Connection conn = null;
		PreparedStatement pstm = null;
		ResultSet rs = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			//创建数据库连接
			conn = DriverManager.getConnection("jdbc:mysql:///spring_day3", "root", "lu910208");
			//编写SQL语句
			String sql = "select * from user where username=?";
			//预编译sql
			pstm = conn.prepareStatement(sql);
			//设置参数值
			pstm.setString(1, "lucy");
			//执行sql
			rs = pstm.executeQuery();
			//遍历结果集
			while(rs.next()) {
				String username = rs.getString("username");
				String password = rs.getString("password");
				//把数据放在user对象里面
				User user = new User();
				user.setUsername(username);
				user.setPassword(password);
				
				System.out.println(user);
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				rs.close();
				pstm.close();
				conn.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
	}
	
	
	//查询有多少条记录操作
	@Test
	public void testCount() {
		//设置数据库信息
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
	//	dataSource.setDriverClassName("com.mysql.jbdc.Driver");
		dataSource.setUrl("jdbc:mysql:///spring_day3");
		dataSource.setUsername("root");
		dataSource.setPassword("lu910208");
				
		//创建jdbcTemplate对象，设置数据源
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		//调用方法查询记录数
		String sql = "select count(*) from user";
		//调用jdbcTemplate对象里面的方法实现update操作
		int count = jdbcTemplate.queryForObject(sql, Integer.class);
		System.out.println(count);
	}
		
}

class MyRowMapper implements RowMapper<User>{

	@Override
	public User mapRow(ResultSet rs, int num) throws SQLException {
		// 从结果集里面把数据得到
		String username = rs.getString("username");
		String password = rs.getString("password");
		//把得到的数据封装到对象里面
		User user = new User();
		user.setPassword(username);
		user.setPassword(password);
		return user;
	}
	
}

