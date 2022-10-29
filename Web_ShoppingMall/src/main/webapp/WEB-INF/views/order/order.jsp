<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page session="true"%>

<!DOCTYPE html>

<html>
<head>
<script type="text/javascript">
// 카카오결제
$(function(){
	$("#btn-kakao-pay").click(function(){
		
		
		// 카카오페이 결제전송
		$.ajax({
			type:'get'
			,url:'/order/pay'
			,data:{
				total_amount: 100
				,payUserName: 200
				,sumPrice:300
				,discountPrice:400
				,totalPrice:500
				,tel:600
				,email:700
				,usePoint:800
				,useCouponNo:900	
				
			},
			success:function(response){
				location.href = response.next_redirect_pc_url			
			}
		})
	})
})
</script>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<meta charset="UTF-8">
<title>상품주문</title>
<style type="text/css">
#down-right {
	position: absolute;
	clear: right;
	float: right;
	width: 300px;
	height: 50px;
	right: 0;
	bottom: 0px;
}

#down-left {
	position: absolute;
	clear: left;
	float: left;
	width: 300px;
	height: 50px;
	left: 0;
	bottom: 0px;
}
</style>
</head>
<body>
	<div align="center">
		<h1>
			상품주문<br />
		</h1>
	</div>


	<div align="center">
		<c:forEach items="${orderinfo}" var="cusinfo">
			<tr>
				<div class="col-md-6">
					<label for="inputEmail4" class="form-label">고객명</label> <input
						type="cusname" class="form-control" id="inputcusname" value="${cusinfo.name}">
				</div>
				<td><a>주소 : <textarea id="address" name="address" rows="1"
							cols="50" style="resize: none">${cusinfo.address}</textarea><br /></a></td>
				<td><a>전화번호 : <input type="text" name="phonenumber"
						value="${cusinfo.phonenumber}" /><br /></a></td>
			</tr>
		</c:forEach>

		<c:forEach items="${orderinfo}" var="productdata">
			<td><a>주문 수량 : ${productdata.quantity}<br /></a></td>
			<td><a>주문 상품 :${productdata.productId}<br /></a></td>
			<td><a>사이즈 : ${productdata.size}<br /></a></td>
		</c:forEach>

		<input type="button" id = "btn-kakao-pay" value="결재요청">

		<div id="down-left" style="display: inline-block">
			<form action="cart.jsp">
				<button type="submit" class="btn btn-secondary">주문취소</button>
			</form>
		</div>

	</div>

</body>
</html>