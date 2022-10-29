<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>상품</title>
</head>
<body>
	<jsp:include page="../menu.jsp"></jsp:include>

	<h1>상품목록</h1>
	<div class="row" align="center">
		<c:forEach items="${productlists}" var="data">
			<div class="col-md-4">
				<p>
					<a href="/product/detail?productId=${data.productId}"><img
						style="width: 305px; margin-right: 20px;" class="img-thumbnail"
						alt="" src="./resources/images/${data.filenamemember}"
						style="width: 100%"> </a>
				</p>
				<p>상품이름: ${data.pname}</p>
				<p>${data.price}
			</div>
		</c:forEach>
	</div>
	<hr>
</body>
</html>