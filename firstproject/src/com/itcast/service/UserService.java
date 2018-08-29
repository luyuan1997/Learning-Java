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

}
