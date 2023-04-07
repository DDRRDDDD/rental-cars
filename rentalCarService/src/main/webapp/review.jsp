<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#review-hovering {
	color: white !important;
	background-color: pink;
}
</style>
</head>
<body>
	<div class="container">
		<jsp:include page="header.jsp"></jsp:include>
		<jsp:include page="boardNav.jsp"></jsp:include>
		<div class="top">
			<p id="top-column1">작성일</p>
			<p id="top-column2">지역</p>
			<p id="top-column4">차종</p>
			<p id="top-column5">별점</p>
		</div>
		<div class="contents">
			<p id="contents-column1">2023.04.07</p>
			<p id="contents-column2">서울 강남</p>
			<a id="contents-column4" href=""><!-- temp link -->
			모닝 어반</a>
			<p id="contents-column5">★★★★★</p>
		</div>
		
		<div class="submit">
			<form method="POST" action="viewContents.jsp"><!-- temp link -->
				<input type="submit" name="command" value="글쓰기">
			</form>
		</div>
	</div>
</body>
</html>