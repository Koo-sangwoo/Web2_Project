<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="../menu.jsp"></jsp:include>
	<div class="container">
		<div class="row">
			<c:forEach items="${productdetail}" var="data">
				<div class="col-md-5">
					<img src="../resources/images/${data.filenamemember}">
				</div>
				<div class="col-md-6">
					<h3>${data.pname}</h3>
					<hr>
					<p>
						판매가 <strong>${data.price}원</strong>
					</p>
					<hr>
					<%
					pageContext.setAttribute("cn", "\n");
					%>
					<p>${fn:replace(data.pdesc,cn,"<br/>")}</p>

					<hr>
					<form method="post" action="/addCart">
						<input type="hidden" name="productId" value="${data.productId}">
						<input type="hidden" name="memberId" value="asdf">

						사이즈 <select class="form-select"
							aria-label="Default select example" name="size">

							<option value="s">S</option>
							<option value="M">M</option>
							<option value="L">L</option>
							<option value="XL">XL</option>
						</select> <span class="offset-md-6">수량 <input type="number"
							style="width: 41.33px; height: 24.67px;" name="quantity"></span>
						<hr>
						<br> <a class="btn btn-primary">바로구매</a> <input
							class="btn btn-primary" type="submit" value="장바구니">
					</form>


				</div>


			</c:forEach>
		</div>
	</div>
</body>
</html>