<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Jblog</title>

</head>
<body>
	<div id="container">
		<jsp:include page="/WEB-INF/views/includes/header.jsp" />
		<jsp:include page="/WEB-INF/views/includes/navigation.jsp" />
		<div id="wapper">
			<div id="content">
				<div id="site-introduction">
				
	<h1>회원 가입</h1>
	
	<form
		id="join-form"
		name="registerForm" 
		action="<c:url value="/members/join"/>"
		method="POST"
		>
		<input type="hidden" name="check" value="f">
		<input type="hidden" name="a" value="join">
		
		<label for="name">이름</label>
		<input name="name" type="text" placeholder="이름을 입력하십시오"><br>
		
		<label for="id">아이디</label>
		<input type="text" name="id" placeholder="아이디를 입력하십시오."><br>
		
		<!-- 아이디 체크 버튼 -->
		<input type="button" 
			value="id 중복 체크" 
			onclick="checkid(this.form.id, '<c:url value="/members/idcheck" />')" /><br>
	
		<label for="password">패스워드</label>
		<input name="password" type="password" placeholder="패스워드를 입력하십시오"><br>
		
		
		<label for="gender">약관동의</label>
		<input type="radio" name=" " value=" " checked>서비스 약관에 동의합니다</radio>
		<input type="submit" value="전송">
		<!--  input type="button" value="폼 검증" onclick="checkForm(this.form)" --> 
	
	</form>
		
				</div>
			</div>
		</div>
		<jsp:include page="/WEB-INF/views/includes/footer.jsp" />
	</div>
</body>
</html>