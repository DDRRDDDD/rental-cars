<%@page import="java.sql.Timestamp"%>
<%@page import="util.DateManager"%>
<%@page import="board.Board"%>
<%@page import="java.util.ArrayList"%>
<%@page import="board.access.BoardAccess"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#notice-hovering {
	color: white !important;
	background-color: pink;
}
</style>
</head>
<body>
	<%
BoardAccess boardDao = BoardAccess.getInstance();
ArrayList<Board> list = boardDao.getNotice();

%>

	<div class="container">
		<jsp:include page="header.jsp"></jsp:include>
		<jsp:include page="boardNav.jsp"></jsp:include>
		<div class="top">
			<p id="top-column1">작성일</p>
			<p id="top-column2">제목</p>
			<p id="top-column3">내용</p>
		</div>
		<div class="contents">
			<p id="contents-column1">2023.04.07</p>
			<p id="contents-column2">제곧내</p>
			<a id="contents-column3" href=""><!-- temp link -->
			 라이라이차차차 헤이빠빠리빠 뚜루따따 ㅋㅋ루삥뽕빵삥뿡 </a>
		</div>

		<% 
		for(int i = 0; i < list.size(); i++){
			Board board = list.get(i);
			Timestamp ts = board.getModifyDate();
			String date = DateManager.getDateForBoard(ts);
			String title = board.getTitle();
			String contents = board.getPreview(50);
				%>
		<div class="contents">
			<p id="contents-column1"><%=date %></p>
			<p id="contents-column2"><%=title %></p>
			<a id="contents-column3" href=""> <!-- temp link -->
			<%=contents %></a>
		</div>
		<%} %>
		<!-- 관리자 추가시 여기도 글쓰기 칸 만들거임 -->
	</div>
</body>
</html>