package com.itcast.service;

import java.sql.SQLException;

import com.itcast.dao.UserDao;
import com.itcast.domain.User;

public class UserService {

	public User login(String username, String password) throws SQLException {
		// 调用dao
		UserDao dao = new UserDao();

		return dao.getUserByUsernameAndPwd(username, password);
	}
	/**
	 * 用户注册
	 * @param user
	 * @return
	 * @throws SQLException 
	 */
	public int regist(User user) throws SQLException {
		UserDao dao = new UserDao();
		return dao.addUser(user);
	}

}
