<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<style>
img {
	float: left;
}

.title {
	font-size: 12px;
	line-height: 1.6;
	font-weight: normal;
	color: #353535;
	width: 120px;
	padding: 8px 4px 8px 11px;
	text-align: left;
	vertical-align: middle;
}
</style>
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../menu.jsp"></jsp:include>
	<c:forEach items="${productdetail}" var="data">
		<img class="img-thumbnail text-start" alt=""
			src="../resources/images/${data.filenamemember}">
		<h3>${data.pname}</h3>
		<div style="float: left">
			<p>판매가     <strong>${data.price}</strong></p>
			<p>
				사이즈 <select class="form-select" aria-label="Default select example">
					<option selected>Open this select menu</option>
					<option value="s">S</option>
					<option value="M">M</option>
					<option value="L">L</option>
					<option value="XL">XL</option>
				</select>
				</p>
		<button type="button" class="btn btn-primary">바로구매</button>
		<button type="button" class="btn btn-secondary">장바구니</button>
		
		</div>

	</c:forEach>
</body>
</html>