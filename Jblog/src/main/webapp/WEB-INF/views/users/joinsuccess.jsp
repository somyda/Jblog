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
</style>
</head>

<body>
<div align="center">
<a href="/jblog"><img class="main" src="<%=request.getContextPath()%>/images/jblog_somy.png" width=200px height=100px alt="JBLOG"></a> <br>
<a href="/user/login">로그인</a> <a class="bold" href="/jblog/user/join">회원가입</a>
<br>
<br>
	<h1>회원 가입 성공</h1>
	<p class="jr-success">회원가입을 축하합니다.</p>
	<p>
		<a href="<c:url value="/user/login"/>">로그인하기</a>
	</p>
</div>
</body>
</html>