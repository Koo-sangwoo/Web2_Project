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

	<h3 class="col-4">상품검색</h3>
	<div class="container">
		<fieldset>
			<form action="/product/searchdetail">
				<div class="col-4">
					<strong>상품분류</strong> <select aria-label="상품분류선택" name="category">
						<option value="pants">PANTS</option>
						<option value="outer">OUTER</option>
						<option value="Tshirt">T-SHIRT</option>
						<option value="shirt">SHIRT</option>
						<option value="neat">NEAT</option>
					</select>
				</div>
				<div class="col-4">
					<strong class="category">상품이름</strong> <input name="search"
						type="text">
					<button type="submit" class="btn btn-secondary">상품검색</button>
				</div>
			</form>
		</fieldset>
	</div>
	
	<br>
	<br>

	<div class="row" align="center">
		<c:forEach items="${productlists}" var="data">
			<div class="col-md-4">
				<p>
					<a href="/product/detail?productId=${data.productId}"><img
						style="width: 305px; margin-right: 20px;" class="img-thumbnail"
						alt="" src="../resources/images/${data.filename}"
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