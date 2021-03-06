<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JBlog 메인</title>
<style type="text/css">
	.main {
		display: block;
		margin-left: auto;
 		margin-right: auto;
	}
	.bold {
		font-weight: bold;
	}
	#joinform	{
		width:300px;
		padding:10px;
		border:1px solid #666;
		border-radius: 10px;
		margin:50px auto;
	}
	
</style>
</head>

<body>
<div align="center">
<a href="/jblog"><img class="main" src="/images/jblog_somy.png" width=200px height=100px alt="JBLOG"></a> <br>
<a href="/jblog/user/login">로그인</a> <a class="bold" href="/jblog/user/join">회원가입</a>

<div align="left">
<form id="joinform"	name="joinform"	action="<c:url value="/user/join"/>" method="POST">
	<label>이름</label> <br>
	<input type="text" name="userName" placeholder="이름을 입력하세요" /> <br><br>
	<label>아이디</label> <br>
	<input type="text" name="id" placeholder="아이디를 입력하세요" />
	<input type="button" value="ID 중복체크" /> <br>
	<!--  input type="button" value="id 중복체크" onclick="checkDuplicate(this.form)" --> 
	<label id="comment"></label> <br><br>
	<label>패스워드</label> <br>
	<input id="password" name="password" type="password" placeholder="비밀번호를 입력하세요"> <br><br>
	<label class="bold">약관동의</label> <br>
	<input type="checkbox" name="terms" value="terms" checked />서비스 약관에 동의합니다 <br>
	<input type="submit" value="전송">
	<!--  input type="button" value=" 전송" onclick="checkForm(this.form)" --> 
</form>
</div>	
</div>

</body>
</html>