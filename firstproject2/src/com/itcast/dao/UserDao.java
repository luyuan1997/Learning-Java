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

}
