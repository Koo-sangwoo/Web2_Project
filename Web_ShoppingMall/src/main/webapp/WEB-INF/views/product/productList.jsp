<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css">
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품</title>
</head>
<body>
	<h1>상품목록</h1>
	<c:forEach items="${productlists}" var = "data">
	<p><img alt="" src="./images/${data.filename}"></p>
	<p>상품이름: ${data.pname}</p>
	<p>${data.price }
	</c:forEach>
</body>
</html>