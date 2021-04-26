package com.bitacademy.jblog.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitacademy.jblog.repository.UserDao;
import com.bitacademy.jblog.vo.User;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserDao dao;

	@Override
	public boolean join(User user) {
		// TODO Auto-generated method stub
		int insertedCount = dao.join(user);
		
		return insertedCount>0 ? true : false;
	}

}
