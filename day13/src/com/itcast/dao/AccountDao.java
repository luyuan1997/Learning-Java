package com.itcast.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.itcast.utils.JdbcUtils;

public class AccountDao {
	/**
	 * 转出
	 * @param conn2 
	 * @param fromUser
	 * @param money
	 * @throws SQLException 
	 */
	public void accountOut(Connection conn, String fromUser, String money) throws SQLException {
		//Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			//conn = JdbcUtils.getConnection();
			//编写sql
			String sql = "update account set money = money - ? where name = ?";
			//编写语句执行者
			st = conn.prepareStatement(sql);
			//设置参数
			st.setString(1, money);
			st.setString(2, fromUser);
			//执行sql
			int i = st.executeUpdate();
			//处理结果
			System.out.println("转出"+i);
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}finally {
			//JdbcUtils.closeResource(conn, st, rs);
			JdbcUtils.closeStatement(st);
		}
		
	}
	/**
	 * 转入
	 * @param conn 
	 * @param toUser
	 * @param money
	 * @throws SQLException 
	 */
	public void accountIn(Connection conn, String toUser, String money) throws SQLException {
		//Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			//conn = JdbcUtils.getConnection();
			//编写sql
			String sql = "update account set money = money + ? where name = ?";
			//编写语句执行者
			st = conn.prepareStatement(sql);
			//设置参数
			st.setString(1, money);
			st.setString(2, toUser);
			//执行sql
			int i = st.executeUpdate();
			//处理结果
			System.out.println("转入"+i);
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}finally {
			//JdbcUtils.closeResource(conn, st, rs);
			JdbcUtils.closeStatement(st);
		}
		
	}
	
	public void accountOut_(String fromUser, String money) throws SQLException {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			conn = JdbcUtils.getConnection();
			//编写sql
			String sql = "update account set money = money - ? where name = ?";
			//编写语句执行者
			st = conn.prepareStatement(sql);
			//设置参数
			st.setString(1, money);
			st.setString(2, fromUser);
			//执行sql
			int i = st.executeUpdate();
			//处理结果
			System.out.println("转出"+i);
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}finally {
			JdbcUtils.closeResource(conn, st, rs);
		}
		
	}
	/**
	 * 转入
	 * @param toUser
	 * @param money
	 * @throws SQLException 
	 */
	public void accountIn_(String toUser, String money) throws SQLException {
		Connection conn = null;
		PreparedStatement st = null;
		ResultSet rs = null;
		
		try {
			conn = JdbcUtils.getConnection();
			//编写sql
			String sql = "update account set money = money + ? where name = ?";
			//编写语句执行者
			st = conn.prepareStatement(sql);
			//设置参数
			st.setString(1, money);
			st.setString(2, toUser);
			//执行sql
			int i = st.executeUpdate();
			//处理结果
			System.out.println("转入"+i);
		} catch (SQLException e) {
			e.printStackTrace();
			throw e;
		}finally {
			JdbcUtils.closeResource(conn, st, rs);
		}
		
	}

}
