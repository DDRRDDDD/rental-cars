<%@page import="board.Board"%>
<%@page import="java.util.ArrayList"%>
<%@page import="board.access.BoardAccess"%>
<%@page import="client.Client"%>
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
	<%
BoardAccess boardDao = BoardAccess.getInstance();
ArrayList<Board> notice = boardDao.getNotice();
%>

	<div class="container">
		<jsp:include page="header.jsp"></jsp:include>
		<div class="main">
			<div class="rental">
				<a id="short" href="rental.jsp"></a> 
				<a id="long" href="rental.jsp"></a>
			</div>
			<section class="board">
				<div id="notice">
					<div class="top">
						<h4>공지사항</h4>
						<a href="notice.jsp">+더보기</a>
					</div><br>
					<% for(int i = 0; i < notice.size(); i++){
						Board board = notice.get(i);
						String contents = board.getPreview(20);
					%>
					<p class="preview"><%=contents %></p>
					<%} %>
					
				</div>
				
				<div id="review">
					<div class="top">
						<h4>이용후기</h4>
						<a href="review.jsp">+더보기</a>
					</div><br>
					<% for(int i = 0; i < notice.size(); i++){
						Board board = notice.get(i);
						String contents = board.getPreview(20);
					%>
					<p class="preview"><%=contents %></p>
					<%} %>
				</div>
			
			</section>
		</div>
	</div>
</body>
</html>