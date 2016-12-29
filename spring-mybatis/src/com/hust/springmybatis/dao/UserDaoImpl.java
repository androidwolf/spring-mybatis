package com.hust.springmybatis.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import com.hust.springmybatis.po.User;

//�̳в���get
public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {

	// ͨ��Springע��
	private SqlSessionFactory sqlSessionFactory;

	// ��sqlSessionFactoryע��
	@Override
	public User findUserById(int id) throws Exception {

		SqlSession sqlSession = this.getSqlSession();

		User user = sqlSession.selectOne("test.findUserById", id);

		return user;

	}

	// �����û�����ģ����ѯ�û��б�
	@Override
	public List<User> findUserByUsername(String username) throws Exception {
		SqlSession sqlSession = this.getSqlSession();
		List<User> list = sqlSession.selectList("test.findUserByName", username);
		return list;
	}

	@Override
	public void insertUser(User user) throws Exception {
		SqlSession sqlSession = this.getSqlSession();
		sqlSession.insert("test.insertUser", user);
		sqlSession.commit();
	}

}
