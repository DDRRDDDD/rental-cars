<%@page import="util.DBManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="resources/index.css">
<title>Insert title here</title>
</head>
<body>
	<div class="container">
		<div class="membership">
		<a id="join" href="join.jsp">회원가입</a>|<a 
		id="login" href="login.jsp">로그인</a>
		</div>
		<a id="banner" href="/">렌터카</a>
		<div class="main">
			<div class="rental">
				<div id="short">
				단기렌트
				</div>
				<div id="long">
				장기렌트
				</div>
			</div>
			<div id="board">게시판</div>		
		</div>
	</div>
</body>
</html>