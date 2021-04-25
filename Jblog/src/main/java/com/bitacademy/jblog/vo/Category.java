package com.bitacademy.jblog.vo;

import java.util.Date;

public class Category {
	int cateNo;
	int userNo;
	String cateName;
	String description;
	Date regDate;
	
	public Category() {
		this.cateNo = 0;
		this.userNo = 0;
		this.cateName = null;
		this.description = null;
		this.regDate = null;
	}
	
	public Category(String cateName, String description) {
		this.cateNo = 0;
		this.userNo = 0;
		this.cateName = cateName;
		this.description = description;
		this.regDate = null;
	}
	
	public int getCateNo() {
		return cateNo;
	}
	public void setCateNo(int cateNo) {
		this.cateNo = cateNo;
	}
	
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	
	public String getCateName() {
		return cateName;
	}
	public void setCateName(String cateName) {
		this.cateName = cateName;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	@Override
	public String toString() {
		return String.format("[cateNo:%d, userNo:%d, cateName:%s]", cateNo, userNo, cateName);
	}
	
}
