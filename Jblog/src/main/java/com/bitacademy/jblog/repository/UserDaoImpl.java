package com.bitacademy.jblog.repository;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bitacademy.jblog.vo.User;

@Repository
public class UserDaoImpl implements UserDao {

	final static Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);
	
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<User> getAllUser() {
		List<User> users = sqlSession.selectList("com.bitacademy.jblog.mybatis.user.selectAll");
		logger.debug("Users = " + users);
		
		return users;
	}

	@Override
	public int join(User user) {
		
		int insertedCount = 0;

		try {
			insertedCount = sqlSession.insert("com.bitacademy.jblog.mybatis.user.insert", user);
			
		} catch (Exception e) {
			// 예외 전환
			// 로그 출력
//			System.err.println("예외 발생:" + e.getMessage());
			logger.error("예외 발생:" + e.getMessage());
			//throw new MemberDaoException("회원 가입 중 오류 발생!", vo);
		}
		return insertedCount;
	}

}
