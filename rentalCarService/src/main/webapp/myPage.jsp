<%@page import="client.Client"%>
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
		<h1></h1>
		<form method="POST" action="../Service">
			<input type="hidden" name="command" value="myPage">
			<input type="submit" name="menu" value="정보수정">
			<input type="submit" name="menu" value="예약조회">
			<input type="submit" name="menu" value="회원탈퇴">
		</form>
	</div>
</body>
</html>