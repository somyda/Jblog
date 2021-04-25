package com.bitacademy.jblog.vo;

import java.util.Date;

public class Post {
	int postNo;
	int cateNo;
	String postTitle;
	String postContent;
	Date regDate;
	
	public Post() {
		this.postNo = 0;
		this.cateNo = 0;
		this.postTitle = null;
		this.postContent = null;
		this.regDate = null;
	}
	
	public Post(String postTitle, String postContent) {
		this.postNo = 0;
		this.cateNo = 0;
		this.postTitle = postTitle;
		this.postContent = postContent;
		this.regDate = null;
	}
	
	
	public int getpostNo() {
		return postNo;
	}
	public void setPostNo(int postNo) {
		this.postNo = postNo;
	}
	
	public int getcateNo() {
		return cateNo;
	}
	public void setcateNo(int cateNo) {
		this.cateNo = cateNo;
	}
	
	public String getPostTitle() {
		return postTitle;
	}
	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}
	
	public String getPostContent() {
		return postContent;
	}
	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}
	
	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}
	
	
	@Override
	public String toString() {
		return String.format("[postNo:%d, cateNo:%d, postTitle:%s]", postNo, cateNo, postTitle);
	}
}
