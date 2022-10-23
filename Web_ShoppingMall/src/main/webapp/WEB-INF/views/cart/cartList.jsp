<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"   href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>장바구니</title>
</head>
<script type="text/javascript">
	function updateSizeCart() {
		if (confirm("수정하시겠습니까?")) {
			document.updateSize.submit();

		} else {
			document.updateSize.reset();

		}
	}

	function updateCart() {
		if (confirm("수정하시겠습니까?")) {
			document.update.submit();

		} else {
			document.update.reset();

		}
	}

	function deleteCarts() {
		if (confirm("삭제하시겠습니까?")) {
			document.deleteCart.submit();

		} else {
			document.deleteCart.reset();

		}
	}
</script>
<body>
	<h1>장바구니</h1>

	<table class="table">
		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">상품</th>
				<th scope="col">상품명</th>
				<th scope="col">사이즈</th>
				<th scope="col">수량</th>
				<th scope="col">가격</th>
				<th scope="col">삭제</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${cartlists}" var="data">
				<tr>
					<td><img alt="" src="./images/${filename}" style="width: 100%"></td>
					<td>${data.pname}</td>
					<td><form action="/cartSizeUpdate" method="post"
							name="updateSize">
							<select name="size">
								<option selected>${data.size}</option>
								<option>S</option>
								<option>M</option>
								<option>L</option>
								<option>XL</option>
							</select> <input type="hidden" name="cartId" value="${data.cartId}">
							<a href="#" class="btn btn-info"
								onclick="updateSizeCart()">수정</a>
						</form></td>
					<td>${data.price}</td>
					<td><form action="/cartUpdate" method="post" name="update">
							<input type="hidden" name="cartId" value="${data.cartId}">
							<input type="number" name="quantity" size="2"
								value="${data.quantity}"> <a href="#"
								class="btn btn-info" onclick="updateCart()">수정</a>
						</form></td>
					<td>${data.totalprice}</td>
					<td><form action="/cartDelete" method="post" name="deleteCart">
							<input type="hidden" name="cartId" value="${data.cartId}">
							<a href="#" class="btn btn-info" onclick="deleteCarts()">삭제</a>
						</form></td>
				</tr>
			</c:forEach>
		</tbody>
		
	</table>
	<img alt="" src="./resources/images/001.jpg" style="width: 100%">
</body>
</html>