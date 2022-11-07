<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<meta charset="UTF-8">

<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<style>
.font-gamja {
	font-family: 'Gamja Flower', cursive;
}

.font-noto {
	font-family: 'Noto Sans KR', sans-serif;
}
</style>

<!-- Custom styles for this template -->
<link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link
	href="https://fonts.googleapis.com/css2?family=Gamja+Flower&family=Noto+Sans+KR:wght@400;700&display=swap"
	rel="stylesheet">
<!--   <nav class="py-2 bg-light border-bottom"> -->
<div class="navbar">
	<ul class="nav font-noto border-bottom">
      <c:if test="${member == null}">
        <li class="nav-item"><a href="/login" class="nav-link link-light pl-5 text-dark" >로그인</a></li>
        <li class="nav-item"><a href="/join" class="nav-link pl-2 text-dark">회원가입</a></li>
      </c:if>
      <c:if test="${member != null}">
      	<li class="nav-item"><a class="nav-link link-light pl-5 text-dark" >${member.name}님, 안녕하세요.</a></li>
      	<li class="nav-item"><a href="/detail" class="nav-link pl-2 text-dark">마이페이지</a></li>
        <li class="nav-item"><a href="/logout" class="nav-link pl-2 text-dark">로그아웃</a></li>
      </c:if>
	</ul>
	<form class="d-flex" action="/product/search">
		<input class="form-control me-2" type="search" placeholder="Search"
			aria-label="Search" name="search">
		<button class="btn btn-outline-success" type="submit">Search</button>
	</form>
</div>
<!--   </nav> -->
<header class="py-3 border-bottom">
	<div class="container d-flex flex-wrap justify-content-center">
		<a href="/"
			class="d-flex align-items-center mb-3 mb-lg-0 me-lg-auto text-dark text-decoration-none font-gamja nav-link link-light">
			<svg class="bi me-2" width="40" height="130"></svg>
			<h1 class="fs-4 " style="font-size: 65px; font-weight: 500;">오늘뭐입지</h1>
		</a>
	</div>
</header>
<ul class="nav nav-pills nav-fill sticky-top font-noto border-bottom" style="background-color: white;">
	<li class="nav-item"><a class="nav-link" style="color: black;"
		aria-current="page" href="/weather">오늘뭐입지?</a></li>
	<li class="nav-item"><a class="nav-link" style="color: black;"
		aria-current="page" href="/product?category=pants">pants</a></li>
	<li class="nav-item"><a class="nav-link" style="color: black;"
		aria-current="page" href="/product?category=outer">outer</a></li>
	<li class="nav-item"><a class="nav-link" style="color: black;"
		aria-current="page" href="/product?category=Tshirt">T-Shirt</a></li>
	<li class="nav-item"><a class="nav-link" style="color: black;"
		aria-current="page" href="/product?category=shirt">shirt</a></li>
	<li class="nav-item"><a class="nav-link" style="color: black;"
		aria-current="page" href="/product?category=neat">neat</a></li>
</ul>

</html>