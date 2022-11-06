<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문내역</title>
<script type="text/javascript">
	function registReview() {
		window.location = "http://localhost:8080/registReview";
	}
</script>
</head>
<body>
	<table class="table">
		<c:forEach items="${orderlist}" var="customer">
			<h1>${customer.memberId}님의주문내역</h1>
		</c:forEach>


		<thead>
			<tr>
				<th scope="col">#</th>
				<th scope="col">상품명</th>
				<th scope="col">수량</th>
				<th scope="col">가격</th>
				<th scope="col">배송정보</th>
			</tr>
		</thead>


		<tbody>

			<c:forEach items="${orderlist}" var="orderlist">
				<td><img alt="" src="./resources/images/${orderlist.filename}"
					width="100px" height="100px"></td>
				<td>${orderlist.pname}</td>
				<td>${orderlist.quantity}개</td>
				<td>${orderlist.price}</td>
				<td>${orderlist.Delivery_status}</td>
				<td><a href="javascript:;" class="btn btn-outline-secondary"
					onclick="registReview();">제품 리뷰</a></td>
				<br />
			</c:forEach>
		</tbody>
	</table>

</body>
</html>