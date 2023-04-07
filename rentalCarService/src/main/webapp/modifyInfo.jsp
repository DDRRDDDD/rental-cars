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
<%
Client client = (Client) session.getAttribute("client");
System.out.println(client);
String name = client.getName();
String id = client.getClientId();
String password = client.getPassword();
String phone = client.getPhone();
String address = client.getAddress();
%>

<div class="container">
	<jsp:include page="header.jsp"></jsp:include>
	<h1>회원 수정 페이지입니다</h1>
		<form method="POST" action="../Service">
			<input type="hidden" name="command" value="regist">
			<input type="text" name="id" value="<%=id%>"required><br>
			<input type="password" name="password" value="<%=password%>" required><br>
			<input type="text" name="name" value="<%=name%>" required><br>
			<input type="text" name="phone" value="<%=phone%>" required><br>
			<input type="text" name="address" value="<%=address%>" required><br>
			<input type="submit" value="수정">
		</form>
	
</div>
</body>
</html>