<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>장바구니</title>
</head>
<body>
<%
String member_id = request.getParameter("memberId");
%>
<script type="text/javascript">
	var message="${msg}";
	alert(message);
	location.href = "/cart?memberId=${member.memberId}";
</script>
</body>
</html>