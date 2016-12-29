package com.hust.springmybatis.mapper;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hust.springmybatis.po.User;

public class UserMapperTest {

	private ApplicationContext applicationContext;

	@Before
	public void init() throws Exception {
		// ´´½¨springÈÝÆ÷
		applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
	}

	@Test
	public void testFindUserById() throws Exception {
		UserMapper userMapper = (UserMapper) applicationContext.getBean("userMapper");
		User user = userMapper.findUserById(2);
		System.out.println(user);
	}

	@Test
	public void testFindUserList() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindUserCount() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindUserListResultMap() {
		fail("Not yet implemented");
	}

	@Test
	public void testFindUserByName() {
		fail("Not yet implemented");
	}

	@Test
	public void testInsertUser() {
		fail("Not yet implemented");
	}

}
