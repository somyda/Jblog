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
</style>
</head>

<body>
<div align="center">
<a href="/jblog"><img class="main" src="<%=request.getContextPath()%>/images/jblog_somy.png" width=200px height=100px alt="JBLOG"></a> <br>
<a href="/jblog/user/login">로그인</a> <a href="/jblog/user/join">회원가입</a>
<br>
<br>
<form action="">
<!-- <form method="post" action="<c:url value="/board/modify" />"> -->
	<input type="text" id="search" name="search" placeholder="검색어를 입력하세요.">
	<button type="submit">검색</button> <br>
	<input type="radio" name="title" value="title">블로그제목
	<input type="radio" name="blogger" value="blogger">블로거
</form>
</div>
</body>

</html>