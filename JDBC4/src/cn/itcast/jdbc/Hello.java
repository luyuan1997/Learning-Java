package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.junit.Test;

public class Hello {
	
	@Test
	public void f1() {
		System.out.println("hello");
	}

	@Test
	public void f2() throws Exception{
		//注册驱动
		Class.forName("com.mysql.jdbc.Driver");
		//获取连接 ctrl+o 整理包
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "lu910208");
		//编写sql
		String sql = "select * from category";
		//编写语句执行者
		PreparedStatement st = conn.prepareStatement(sql);
		//设置参数
		//执行sql
		ResultSet rs=st.executeQuery();
		
		//处理结果
		while(rs.next()) {
			System.out.println(rs.getString("cid")+"::"+rs.getString("cname"));
		}
		
		//释放资源,后创建的先关闭
		rs.close();
		st.close();
		conn.close();
	}
}
