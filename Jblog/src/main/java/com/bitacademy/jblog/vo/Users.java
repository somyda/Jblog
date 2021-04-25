package com.bitacademy.jblog.vo;

import java.util.Date;

public class Users{
	int userNo;
	String id;
	String userName;
	String password;
	Date joinDate;
	
	public Users() {
		this.userNo = 0;
		this.id = null;
		this.userName = null;
		this.password = null;
		this.joinDate = null;
	}
	
	public Users(String id, String userName, String password) {
		this.userNo = 0;
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.joinDate = null;
	}
	
	
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	
	@Override
	public String toString() {
		return String.format("[userNo:%d, id:%s, userName:%s]", userNo, id, userName);
	}
}

