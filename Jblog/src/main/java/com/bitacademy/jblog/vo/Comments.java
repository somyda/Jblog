package com.bitacademy.jblog.vo;

import java.util.Date;

public class Comments {
	int cmtNo;
	int postNo;
	String cmtContent;
	Date regDate;
	
	public Comments() {
		super();
		this.cmtNo = 0;
		this.postNo = 0;
		this.cmtContent = null;
		this.regDate = null;
	}

	public Comments(int postNo, String cmtContent) {
		super();
		this.postNo = postNo;
		this.cmtContent = cmtContent;
	}

	public int getCmtNo() {
		return cmtNo;
	}
	public void setCmtNo(int cmtNo) {
		this.cmtNo = cmtNo;
	}

	public int getPostNo() {
		return postNo;
	}
	public void setPostNo(int postNo) {
		this.postNo = postNo;
	}

	public String getCmtContent() {
		return cmtContent;
	}
	public void setCmtContent(String cmtContent) {
		this.cmtContent = cmtContent;
	}

	public Date getRegDate() {
		return regDate;
	}
	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "Comments [cmtNo=" + cmtNo + ", postNo=" + postNo + ", regDate=" + regDate + "]";
	}
}
