<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>정보 수정</title>
</head>
<body>
<jsp:include page="../menu.jsp" />
	<form name="update" method="post">
		<p>
			아이디 : <input type="text" name="memberId" value="${member.memberId}"
				disabled="disabled">
		</p>
		<p>
			비밀번호 : <input type="password" name="password" value="${member.password}">
		</p>
		<p>
			이름 : <input type="text" name="name" value="${member.name}">
		</p>
		<p>
			주소 : <input type="text" name="address" value="${member.address}">
		</p>
		<p>
			전화번호 : <input type="text" name="phonenumber" value="${member.phonenumber}">
		</p>
		<p>
			이메일 : <input type="email" name="email" value="${member.email}">
		</p>
		<p>
			<input type="submit" value="수정">
		</p>
	</form>

</body>
</html>