<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<title>오늘뭐입지</title>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3"
	crossorigin="anonymous"></script>
<link href="./resources/css/carousel.css" rel="stylesheet">
<link rel="canonical"
	href="https://getbootstrap.com/docs/5.2/examples/carousel/">
<style>
.bd-placeholder-img {
	font-size: 1.125rem;
	text-anchor: middle;
	-webkit-user-select: none;
	-moz-user-select: none;
	user-select: none;
}

@media ( min-width : 768px) {
	.bd-placeholder-img-lg {
		font-size: 3.5rem;
	}
}

.b-example-divider {
	height: 3rem;
	background-color: rgba(0, 0, 0, .1);
	border: solid rgba(0, 0, 0, .15);
	border-width: 1px 0;
	box-shadow: inset 0 .5em 1.5em rgba(0, 0, 0, .1), inset 0 .125em .5em
		rgba(0, 0, 0, .15);
}

.b-example-vr {
	flex-shrink: 0;
	width: 1.5rem;
	height: 100vh;
}

.bi {
	vertical-align: -.125em;
	fill: currentColor;
}

.nav-scroller {
	position: relative;
	z-index: 2;
	height: 2.75rem;
	overflow-y: hidden;
}

.nav-scroller .nav {
	display: flex;
	flex-wrap: nowrap;
	padding-bottom: 1rem;
	margin-top: -1px;
	overflow-x: auto;
	text-align: center;
	white-space: nowrap;
	-webkit-overflow-scrolling: touch;
}
</style>
</head>
<body>
	<jsp:include page="menu.jsp"></jsp:include>
	<div id="carouselExampleCaptions" class="carousel slide" data-bs-ride="false">
  <div class="carousel-inner">
    <div class="carousel-item active">
      <img src="/resources/images/winter.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block ">
        <h3 class="fw-bold font-noto">오늘 날씨에 맞는 옷차림을 골라보세요!</h3>
        <p class="font-noto">날씨별 옷차림 추천 기능을 제공합니다</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="/resources/images/jacket.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h3 class="fw-bold font-noto">2022 F/W 신상 입고!</h3>
        <p class="font-noto">오늘뭐입지와 함께 새 옷 장만하세요</p>
      </div>
    </div>
    <div class="carousel-item">
      <img src="/resources/images/travel.jpg" class="d-block w-100" alt="...">
      <div class="carousel-caption d-none d-md-block">
        <h3 class="fw-bold font-noto">여행가기 전 쇼핑은 오늘뭐입지에서!</h3>
        <p class="font-noto">다양한 스타일의 옷을 쇼핑할 수 있습니다</p>
      </div>
    </div>
  </div>
  <button class="carousel-control-prev" style="border-color: transparent; background-color: transparent;" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="prev">
    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
  </button>
  <button class="carousel-control-next" style="border-color: transparent; background-color: transparent;" type="button" data-bs-target="#carouselExampleCaptions" data-bs-slide="next">
    <span class="carousel-control-next-icon" aria-hidden="true"></span>
  </button>
</div>
			<div class="row" align="center">
				<c:forEach items="${productlists}" var="data">
					<div class="col-md-4">
						<p>
							<a href="/product/detail?productId=${data.productId}"><img
								style="width: 300px; height: 300px;" class="img-thumbnail"
								alt="" src="./resources/images/${data.filename}"> </a>
						</p>
						<p style="font-weight : bold">${data.pname}</p>
						<hr style="width: 300px">
						<p>${data.price}원
					</div>
				</c:forEach>
			</div>
</body>
</html>
