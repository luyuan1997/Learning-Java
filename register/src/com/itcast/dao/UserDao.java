package com.itcast.dao;

import java.sql.SQLException;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.itcast.domain.User;
import com.itcast.utils.DataSourceUtils;

public class UserDao {
	
	/**
	 * 
	 * @param username
	 * @param password
	 * @return
	 * @throws SQLException
	 */
	public User getUserByUsernameAndPwd(String username, String password) throws SQLException {
		// 创建queryrunner
		QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());

		// 编写sql
		String sql = "select * from user where username=? and password=?";
		// 执行sql
		User user = qr.query(sql, new BeanHandler<>(User.class), username, password);
		return user;
	}
	/**
	 * 添加用户
	 * @param user 用户信息
	 * @return
	 * @throws SQLException 
	 */
	public int addUser(User user) throws SQLException {
		  QueryRunner qr = new QueryRunner(DataSourceUtils.getDataSource());
		  String sql = "insert into user(username,password,email,name,sex,birthday,hobyy) values (?,?,?,?,?,?,?)";
		  return qr.update(sql, user.getUsername(), user.getPassword(), user.getEmail(), 
				  user.getName(), user.getSex(),user.getBirthday(),
				  user.getHobby());
	}

}
