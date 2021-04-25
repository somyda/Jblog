package com.bitacademy.jblog.vo;

public class Blog {
	int userNo;
	String blogTitle;
	String logoFile;
	
	public Blog() {
		this.userNo = 0;
		this.blogTitle = null;
		this.logoFile = null;
	}
	
	public Blog(String blogTitle, String logoFile) {
		this.userNo = 0;
		this.blogTitle = blogTitle;
		this.logoFile = logoFile;
	}
	
	public int getUserNo() {
		return userNo;
	}
	public void setUserNo(int userNo) {
		this.userNo = userNo;
	}
	
	public String getBlogTitle() {
		return blogTitle;
	}
	public void setBlogTitle(String blogTitle) {
		this.blogTitle = blogTitle;
	}
	
	public String getLogoFile() {
		return logoFile;
	}
	public void setLogoFile(String logoFile) {
		this.logoFile = logoFile;
	}
	
	@Override
	public String toString() {
		return String.format("[userNo:%d, blogTitle:%s]", userNo, blogTitle);
	}
	
}
