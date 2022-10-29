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
					<div style="float: left">
						<p>
							판매가 <strong>${data.price}원</strong>
						</p>
						<hr>
						<%
						pageContext.setAttribute("cn", "\n");
						%>
						<p>${fn:replace(data.pdesc,cn,"<br/>")}</p>

						<hr>
						<p>
							사이즈 <select class="form-select"
								aria-label="Default select example">

								<option value="s">S</option>
								<option value="M">M</option>
								<option value="L">L</option>
								<option value="XL">XL</option>
							</select>
						</p>
						<hr>
						<br>
						<button type="button" class="btn btn-primary">바로구매</button>
						<button type="button" class="btn btn-secondary">장바구니</button>
					</div>
				</div>

			</c:forEach>
		</div>
	</div>
</body>
</html>