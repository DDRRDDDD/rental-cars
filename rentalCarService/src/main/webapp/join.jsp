<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="resources/memberShip.css">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
	<jsp:include page="header.jsp"></jsp:include>
		<h1>회원가입 페이지 맞아요</h1>
		<form method="POST" action="../Service">
			<input type="hidden" name="command" value="regist">
			<input type="text" name="id" required placeholder="아이디"><br>
			<input type="password" name="password" required placeholder="비밀번호"><br>
			<input type="text" name="name" required placeholder="이름"><br>
			<input type="text" name="phone" required placeholder="전화번호"><br>
			<input type="text" name="address" required placeholder="주소"><br>
			<input type="submit" value="회원가입">
		</form>
	</div>
</body>
</html>