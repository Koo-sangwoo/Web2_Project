<%@ page contentType="text/html; charset=utf-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<title>로그인</title>
</head>
<body>

	<jsp:include page="../menu.jsp" />
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-5">로그인</h1>
		</div>
	</div>

	<div class="container">
		<section id="content">
			<form name="login" class="form-horizontal" method="post">
					<div class="input_area">
						<label for="memberId">아이디</label> <input type="text" id="memberId"
							name="memberId" required="required" />
					</div>

					<div class="input_area">
						<label for="password">패스워드</label> <input type="password"
							id="password" name="password" required="required" />
					</div>
					<div class="form-group  row">
						<div class="col-sm-offset-2 col-sm-10 ">
							<input type="submit" class="btn btn-primary " value="로그인">
						</div>
					</div>
					
			</form>
		</section>
	</div>
</body>
</html>
