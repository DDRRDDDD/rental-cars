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
		<h1>로그인 페이지 맞아요</h1>
		<form method="POST" action="../Service">
			<input type="hidden" name="command" value="login">
			<input type="text" name="id" required placeholder="아이디"><br>
			<input type="password" name="password" required placeholder="비밀번호"><br>
			<input type="submit" value="로그인">
		</form>
	</div>
</body>
</html>