package com.hust.springmybatis.dao;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hust.springmybatis.po.User;

public class UserDaoImplTest {

	private ApplicationContext applicationContext;

	@Before
	public void init() throws Exception {

		// 创建spring容器
		applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
	}

	@Test
	public void testFindUserById() throws Exception {
		// 从spring容器中获取UserDao这个bean
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		User user = userDao.findUserById(2);
		System.out.println(user);
	}

	@Test
	public void testFindUserByUsername() throws Exception {
		// 从spring容器中获取UserDao这个bean
		UserDao userDao = (UserDao) applicationContext.getBean("userDao");
		List<User> users = userDao.findUserByUsername("明");
		for (User user : users) {
			System.out.println(user);
		}
	}

	@Test
	public void testInsertUser() {
		fail("Not yet implemented");
	}

}
