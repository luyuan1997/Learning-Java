package dao;

import java.util.List;

import pojo.User;

public interface UserDao {

	public User findUserById(Integer id);
	
	public List<User> findUserByUserName(String userName);
}
