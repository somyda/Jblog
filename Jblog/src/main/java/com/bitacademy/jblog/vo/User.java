package com.bitacademy.jblog.vo;

import java.util.Date;

//import org.hibernate.validator.constraints.Email;
//import org.hibernate.validator.constraints.Length;
//import org.hibernate.validator.constraints.NotEmpty;

public class User{
	int userNo;

//	@NotEmpty	//	name 필드는 null이 아니어야 하고
//	@Length(min=2, max=8)		//	길이가 2글자 ~ 8글자
	String id;
	
//	@NotEmpty	//	name 필드는 null이 아니어야 하고
//  @Length(min=2, max=10)		//	길이가 2글자 ~ 8글자
    String userName;

//	@NotEmpty	//	name 필드는 null이 아니어야 하고
//	@Length(min=4, max=20)	//	길이가 4 ~ 20글자여야 한다
	String password;

	Date joinDate;
	
	public User() {
		this.userNo = 0;
		this.id = null;
		this.userName = null;
		this.password = null;
		this.joinDate = null;
	}
	
	public User(String id, String userName, String password) {
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
		return String.format("[userNo:%d, id:%s, userName:%s, password:%s]", userNo, id, userName, password);
	}
}

