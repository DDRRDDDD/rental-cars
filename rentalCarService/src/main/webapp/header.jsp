<%@page import="client.Client"%>
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
<%
	if(session.getAttribute("client") == null){
		request.setAttribute("command", "logout");		
		response.sendRedirect("../Service");
	}
%>
	<div class="membership">
		<% if (session.getAttribute("client") == null) { %>
		<a id="join" href="join.jsp">|회원가입|</a>
		<a id="login" href="login.jsp">|로그인|</a>
		<% } else { 
			Client client = (Client) session.getAttribute("client");
			String name = client.getName();
		%>
		|<%=name%> 님|
		<a id="mypage" href="myPage.jsp">|마이페이지|</a>
		<a id="logout" onclick="logout()">|로그아웃|</a>
		<% } %>
	</div>
	<a id="banner" href="/">라이라이차차차</a>
	<nav>
		<a href=""></a>
	</nav>
	
	
	<script src="../resources/do.js"></script>
</body>
</html>