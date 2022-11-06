<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>리뷰작성</title>
</head>

<body>
<table>
<thead>
<td>사진</td>
<td>제품명</td>
<td>구매자</td>
<td>제목</td>
<td>내용</td>


</thead>
	<c:forEach items="regist_info" var="info">
	<td></td>
	<td></td>
	<td></td>
	<td></td>
	<td></td>
	
	
	
	</c:forEach>
	</table>
</body>
</html>