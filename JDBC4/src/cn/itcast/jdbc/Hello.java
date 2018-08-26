package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.junit.Test;

import cn.itcast.utils.JdbcUtils;

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
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/day07", "root", "lu910208");
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
	
	@Test
	public void f3() {
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement st = null;
		
		try {
			//获取连接
			conn = JdbcUtils.getConnection();
			//编写sql
			String sql = "insert into category values(?,?)";
			//获取语句执行者
			st=conn.prepareStatement(sql);
			//设置参数
			st.setString(1, "c005");
			st.setString(2, "户外");
			//执行sql
			int i = st.executeUpdate();
			//处理结果
			if(i==1) {
				System.out.println("success");
			}else {
				System.out.println("fail");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtils.closeResource(conn, st, rs);
		}
	}
	
	@Test
	public void update() {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			conn = JdbcUtils.getConnection();
			String sql = "update category set cname= ? where cid= ?";
			st=conn.prepareStatement(sql);
			st.setString(1, "母婴");
			st.setString(2, "c006");
			
			int i = st.executeUpdate();
			
			if(i==1) {
				System.out.println("success");
			}else {
			 	System.out.println("fail");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtils.closeResource(conn, st, rs);
		}
	}
	
	@Test
	public void delete() {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			conn=JdbcUtils.getConnection();
			String sql = "delete from category where cid= ?";
			st=conn.prepareStatement(sql);
			st.setString(1, "c006");
			int i = st.executeUpdate();
			if(i==1) {
				System.out.println("success");
			}else {
			 	System.out.println("fail");
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			JdbcUtils.closeResource(conn, st, rs);
		}
	}
}
