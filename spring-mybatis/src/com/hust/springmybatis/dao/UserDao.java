package com.hust.springmybatis.dao;

import java.util.List;

import com.hust.springmybatis.po.User;

/**
 * 
 * @author	yexx
 * @version 1.0
 */
public interface UserDao {
	
	public User findUserById(int id) throws Exception;
	
	public List<User> findUserByUsername(String username) throws Exception;
	
	public void insertUser(User user) throws Exception;

}
