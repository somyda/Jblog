package com.bitacademy.jblog.repository;

import java.util.List;

import com.bitacademy.jblog.vo.User;

public interface UserDao {

	List<User> getAllUser();
	int join(User user);
}
