<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>장바구니</title>
</head>
<script type="text/javascript">
<%
String member_id = request.getParameter("memberId");
%>
function updateCart(cartId) {
	var quantity= document.getElementById(cartId+"quantity").value;
		if (quantity < 1) {
		alert("1 이상의 숫자를 입력해주세요.");
		location.href = "/cart?memberId=" + "<%=member_id%>";
		} else {
		location.href = "/cartUpdate?quantity="+quantity+"&cartId="+cartId+"memberId="+<%=member_id%>;
		}
	}
</script>
<script type="text/javascript" src="./resources/js/cartValidation.js"></script>
<body>
	<jsp:include page="../menu.jsp"></jsp:include>
	<br>
	<br>

	<div class="container bordered">
		<h5 class="font-noto" style="font-weight: bold;">장바구니</h5>
		<br>
		<br>
		<table class="table font-noto">
			<thead>
				<tr class="table-light">
					<th scope="col" style="text-align: center;">#</th>
					<th scope="col" style="text-align: center;">상품</th>
					<th scope="col" style="text-align: center;">상품명</th>
					<th scope="col" style="text-align: center;">사이즈</th>
					<th scope="col" style="text-align: center;">수량</th>
					<th scope="col" style="text-align: center;">가격</th>
					<th scope="col" style="text-align: center;">삭제</th>
				</tr>
			</thead>
			<tbody>

				<c:forEach items="${cartlists}" var="data" varStatus="status">
					<tr>
						<td style="vertical-align: middle; text-align: center;">${status.count}</td>
						<td style="vertical-align: middle; text-align: center;"><img
							alt="" src="./resources/images/${data.filename}"
							style="width: 100px; height: 100px"></td>
						<td style="vertical-align: middle; text-align: center;">${data.pname}</td>

						<td style="vertical-align: middle; text-align: center;">
							<form action="/cartSizeUpdate" method="post"
								name="updateSize${data.cartId}">
								<select name="size">
									<option selected>${data.size}</option>
									<option>S</option>
									<option>M</option>
									<option>L</option>
									<option>XL</option>
								</select> <input type="hidden" name="cartId" value="${data.cartId}">
								<input type="hidden" name="memberId" value="<%=member_id%>">
								<input type="submit" class="btn btn-outline-secondary"
									value="수정">
							</form>
						</td>
						<td style="vertical-align: middle; text-align: center;"><input
							type="number" id="${data.cartId}quantity"
							style="width: 41.33px; height: 24.67px;" value="${data.quantity}">
							<input type="hidden" name="memberId" value="<%=member_id%>">
							<a href="#" class="btn btn-outline-secondary"
							onclick="updateCart(${data.cartId})">수정</a></td>
						<td style="vertical-align: middle; text-align: center;">${data.totalprice}</td>
						<td style="vertical-align: middle; text-align: center;"><a
							href="#" class="btn btn-outline-secondary"
							onclick="deleteCarts(${data.cartId})">삭제</a></td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
			<c:url value="/orderPay" var="url">
						<c:param name="memberId" value="<%=member_id%>"></c:param>
					</c:url>
			
			<a href="${url}" class="btn btn-outline-secondary">
					구매</a>

	</div>
	<c:if test="${member.memberId == null}">
		<script>
	alert("로그인 후 사용해주세요.");
	location.href="/login";
		</script>
	</c:if>



</body>

</html>