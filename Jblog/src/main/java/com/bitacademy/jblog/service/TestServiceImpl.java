package com.bitacademy.jblog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bitacademy.jblog.repository.UserDao;
import com.bitacademy.jblog.vo.User;

@Service
public class TestServiceImpl implements TestService {
	
	@Autowired
	UserDao dao;

	public List<User> getAllUser() {
		return dao.getAllUser();
	}

}
