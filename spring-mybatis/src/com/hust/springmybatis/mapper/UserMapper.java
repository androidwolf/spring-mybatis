package com.hust.springmybatis.mapper;

import java.util.List;

import com.hust.springmybatis.po.User;
import com.hust.springmybatis.po.UserQueryVo;

/**
 * @author yexx
 * @version 1.0
 */
public interface UserMapper {

	public User findUserById(int id) throws Exception;

	public List<User> findUserList(UserQueryVo userQueryVo) throws Exception;

	public Integer findUserCount(UserQueryVo userQueryVo) throws Exception;
	
	//��ѯ�û���ʹ��resultMap���ӳ��
	public List<User> findUserListResultMap(UserQueryVo userQueryVo) throws Exception;

	public List<User> findUserByName(String username) throws Exception;

	public void insertUser(User user) throws Exception;

}
