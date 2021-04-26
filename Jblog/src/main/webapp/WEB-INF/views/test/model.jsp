<%@ page language="java" contentType="text/html; charset=UTF-8"	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Model</title>
</head>

<body>
	<!-- 게시물 Loop -->
	<table border=1>
        <c:forEach items="${list}" var="user">
		<tr>
			<td>${ user.userNo }</td>
			<td>${ user.id }</td>
			<td>${ user.userName }</td>
			<td>${ user.password }</td>
			<td>${ user.joinDate }</td>
		</tr>
	 	</c:forEach>
	</table>
</body>
</html>