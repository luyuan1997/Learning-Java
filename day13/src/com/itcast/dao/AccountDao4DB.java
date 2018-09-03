package com.itcast.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;

import com.itcast.utils.DataSourceUtils;
import com.itcast.utils.JdbcUtils;

public class AccountDao4DB {
	/**
	 * 转出
	 * @param conn2 
	 * @param fromUser
	 * @param money
	 * @throws SQLException 
	 */
	public void accountOut(String fromUser, String money) throws SQLException{
		//创建queryrunner
		QueryRunner qr = new QueryRunner();
		//创建sql
		String sql = "update account set money = money - ? where name = ?";
		//执行sql
		qr.update(DataSourceUtils.getConnection(), sql, money,fromUser);
	}
	/**
	 * 转入
	 * @param conn 
	 * @param toUser
	 * @param money
	 * @throws SQLException 
	 */
	public void accountIn(String toUser, String money) throws SQLException{
		//创建queryrunner
		QueryRunner qr = new QueryRunner();
		//创建sql
		String sql = "update account set money = money + ? where name = ?";
		//执行sql
		qr.update(DataSourceUtils.getConnection(), sql, money,toUser);
	}

}
