<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>error!</title>
</head>
<body>
	<script type="text/javascript">
		var message="${msg}";
		alert(message);
		location.href = "/join?";
	</script>

<!--  
<h1>아이디가 중복되었습니다.</h1>
	<p>
		<a href="/join">회원가입</a>
	</p>
-->

</body>
</html>