<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet">
    <link href="https://getbootstrap.com/docs/5.2/assets/css/docs.css" rel="stylesheet">
    <title>게시판</title>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<table>
		<td>상품명</td>
		<td>아이디</td>
		<td>제목</td>
		<td>내용</td>
		<td>생성및업데이트 날자</td>
		<c:forEach items="${lists}" var="data">
			<tr>
				<td>${data.pname}</td>
				<td>${data.cusname}</td>
				<td>${data.title}</td>
				<td>${data.content}</td>
				<td>${data.createDate}</td>
			</tr>
		</c:forEach>
	</table>
	<br>

	<nav aria-label="Page navigation example">
		<ul class="pagination">
			<c:forEach begin="1" end="5" var="i">
				<li class="page-item"><a class="page-link"
					href="/board/lists?num=${i}">${i}</a></li>
			</c:forEach>
		</ul>
	</nav>
</body>
</html>