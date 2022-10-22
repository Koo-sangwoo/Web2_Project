<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>상품</title>
</head>
<body>
	<h1>상품목록</h1>
	<c:forEach items="productList" var = "data">
	<p><img alt="" src="./images/${filename}">
	</c:forEach>
</body>
</html>