<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>��ٱ���</title>
</head>
<body>
<%
String member_id = request.getParameter("memberId");
%>
<script type="text/javascript">
	var message="${msg}";
	alert(message);
	location.href = "/cart?memberId="+<%=member_id%>;
</script>
</body>
</html>