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
<style>
div.table{
display: table;
}
form.tr, div.tr {
display: table-row;

}
span.td{
display: table-cell;
padding: 10px;
border-bottom: 1px solid grey;

}
</style>
<script type="text/javascript">
<%
String member_id = request.getParameter("memberId");
%>
function updateCart(cartId, index) {
	var quantity= document.getElementById(cartId+"quantity").value;
		if (quantity < 1) {
		alert("1 이상의 숫자를 입력해주세요.");
		location.reload();
		} else {
			document.carts[index].action= "/cartUpdate";
			document.carts[index].submit();
<%-- 		location.href = "/cartUpdate?quantity="+quantity+"&cartId="+cartId+"memberId="+<%=member_id%>; --%>
		}
	}
function cartSizeUpdate(index){
	document.carts[index].action="/cartSizeUpdate";
	document.carts[index].submit();
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
		<div class="table font-noto">
				<div class="tr table-light">
					<span class="td" scope="col" style="text-align: center; border-top: thin solid grey;">#</span>
					<span class="td" scope="col" style="text-align: center; border-top: thin solid grey;">상품</span>
					<span class="td" style="text-align: center; border-top: thin solid grey;">상품명</span>
					<span class="td" style="text-align: center; border-top: thin solid grey;">사이즈</span>
					<span class="td" style="text-align: center; border-top: thin solid grey;">수량</span>
					<span class="td" style="text-align: center; border-top: thin solid grey;">가격</span>
					<span class="td" style="text-align: center; border-top: thin solid grey;">삭제</span>
				</div>

				<c:forEach items="${cartlists}" var="data" varStatus="status">
					<form method="get" name="carts" class="tr table-light">
						<span class="td" style="vertical-align: middle; text-align: center;"><p>${status.count}</p></span>
						<span class="td" style="vertical-align: middle; text-align: center;"><img
							alt="" src="./resources/images/${data.filename}"
							style="width: 100px; height: 100px"></span>
						<span class="td" style="vertical-align: middle; text-align: center;">${data.pname}</span>

						<span class="td" style="vertical-align: middle; text-align: center;"><select
							name="size">
								<option selected>${data.size}</option>
								<option>S</option>
								<option>M</option>
								<option>L</option>
								<option>XL</option>
						</select> <input type="hidden" name="cartId" value="${data.cartId}">
							<input type="hidden" name="memberId" value="<%=member_id%>">
							<a href="#" class="btn btn-outline-secondary"
							onclick="cartSizeUpdate(${status.index})">수정</a></span>
						<span class="td" style="vertical-align: middle; text-align: center;"><input
							type="number" id="${data.cartId}quantity" name="quantity"
							style="width: 41.33px; height: 24.67px;" value="${data.quantity}">
							<a href="javascript:;" class="btn btn-outline-secondary"
							onclick="updateCart(${data.cartId}, ${status.index})">수정</a></span>
						<span class="td" style="vertical-align: middle; text-align: center;">${data.totalprice}</span>
						<span class="td" style="vertical-align: middle; text-align: center;"><a
							href="#" class="btn btn-outline-secondary"
							onclick="deleteCarts(${status.index})">삭제</a></span>
					</form>
				</c:forEach>
			</tbody>
		</table>
			<c:url value="/orderPay" var="url">
						<c:param name="memberId" value="<%=member_id%>"></c:param>
					</c:url>
			<br><br>
			
	</div>
	<a href="${url}" class="btn btn-outline-secondary">
					상품구매</a><br><br>
	
	<c:if test="${member.memberId == null}">
		<script>
	alert("로그인 후 사용해주세요.");
	location.href="/login";
		</script>
	</c:if>



</body>

</html>