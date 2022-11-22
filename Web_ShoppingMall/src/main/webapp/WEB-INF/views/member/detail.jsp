<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원상세</title>
</head>
<body>
<jsp:include page="../menu.jsp" />
	<h1>회원상세</h1>
	<p>아이디 : ${member.memberId}</p>
	<p>이름 : ${member.name}</p>
	<p>주소 : ${member.address}</p>
	<p>전화번호 : ${member.phonenumber}</p>
	<p>이메일 : ${member.email}</p>

	<p>
		<a href="update?memberId=${member.memberId}">수정</a>
	</p>

	<form action="/delete" method="post">
		<input type="hidden" name="memberId" value="${member.memberId}"> <input
			type="submit" value="삭제">
	</form>
	<!-- 관리자용 -->
	<c:if test="${member.verify==1}">
	<p>
		<a href="/?">상품 추가</a>
		<a href="/?">상품 수정</a>
		<a href="/?">상품 삭제</a>
	</p>
	</c:if>
	
	<form action="/cart?memberId=" method="get">
		<input type="hidden" name="memberId" value="${member.memberId}"> <input
			type="submit" value="장바구니">
	</form>
</body>
</html>