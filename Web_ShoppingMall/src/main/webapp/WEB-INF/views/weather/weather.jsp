<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>오늘 뭐 입지?</title>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
<link href="product.css" rel="stylesheet">
<script src="http://code.jquery.com/jquery-latest.min.js"></script>
<script type="text/javascript">
//ajax로 현재 날씨 컨트롤러로 보내기
function addList (weatherTemp, weatherId){
	
	$.ajax({
		type: "POST",
		url: "/addLists",
		data:JSON.stringify({"temp" : weatherTemp,"weather" : weatherId}),
	    contentType: "application/json; charset=UTF-8",
		success: function(data) {
			var y = "";
			data.forEach(( i)=>{
			 y += '<div class="col-md-4"><p><a href="/product/detail?productId=' + i.productId + '"><img style="width: 305px; margin-right: 20px;" class="img-thumbnail" alt="" src="./resources/images/' +i.filenamemember + '" style="width: 100%"></a></p><p>상품이름: ' + i.pname + '</p><p>' + i.price + '</div>'   
			   } )
             document.querySelector('#test').insertAdjacentHTML('afterbegin', y)
		}, 
		error: function(){
			alert('오류발생');
		}
	})
	
}

//현재 위치 받기
function getLocWeather(position){
	//위도
	var userLat = position.coords.latitude;
	//경도
	var userLng = position.coords.longitude;
	
	getWeatherApi(userLat, userLng);
				
}
//OpenWeatherMap에서 API 받아서 현재 날씨 확인
function getWeatherApi(userLat, userLng){
		var APIKEY = "17d28e0afcb23f0136370e56315d8426";
		var weatherId;
		var weatherTemp;

fetch("https://api.openweathermap.org/data/2.5/weather?lat=" + userLat + "&lon=" + userLng + "&appid=" + APIKEY + "&units=metric")
	.then((response) => response.json())
	.then((data) => {
		weatherId = data.weather[0].id; //날씨 아이디
		weatherTemp = data.main.temp; //기온
		var img = '<img id="testImg" style="vertical-align: middle;" src="http://openweathermap.org/img/wn/' + data.weather[0].icon + '@2x.png">';
		weatherInfo.innerHTML = "현재 기온 &nbsp;&nbsp;" + weatherTemp + "º &nbsp;&nbsp;&nbsp; 날씨 " + img;
		testImg.setAttribute("src","http://openweathermap.org/img/wn/" + data.weather[0].icon + "@2x.png");
		if (weatherTemp < 8) {
			weatherTemp = 'superlow';
			} else if (weatherTemp>=8 && weatherTemp<17) {
			weatherTemp ='low';
			} else if (weatherTemp>=17 && weatherTemp<23) {
			weatherTemp = 'medium';
			} else {weatherTemp = 'high';}
			
			if (weatherId < 599) {
			weatherId = 'rain';
			}else if (weatherId <699 ) {
			weatherId = 'snow';
			} else if (weatherId == 800) {
			weatherId = 'clear';
			} else {weatherId = 'other';}

			
			addList(weatherTemp, weatherId);

		
});

}
		
		
//오류 발생시 실행
function showErrorMsg(error){
	switch(error.code){
		case error.PERMISSION_DENIED:
		alert("사용자가 사용 요청을 거부했습니다.");
		break;
				
		case error.POSITION_UNAVAILABLE:
		alert("가져온 위치 정보를 사용할 수 없습니다.");
		break;
				
		case error.TIMEOUT:
		alert("요청 허용 시간을 초과했습니다.");
		break;
				
		case error.UNKNOWN_ERROR:
		alert("알 수 없는 오류가 발생했습니다.");
		break;
	}	}


navigator.geolocation.getCurrentPosition(getLocWeather, showErrorMsg);


</script>
</head>

<body>
	<jsp:include page="../menu.jsp"></jsp:include>
	<div
		class="position-relative overflow-hidden p-3 m-md-3 text-center bg-light font-noto">
		<div class="col-md-5 p-lg-5 mx-auto my-5">
			<p class="lead fw-normal">
				현재 고객님께서 계신 곳의 기온과 날씨에 따라<br>옷차림을 추천해 드립니다.
			</p>
			<div class="card">
				<div class="card-body">
					<h4 id=weatherInfo class="cart-title"
						style="vertical-align: middle; text-align: center;"></h4>
				</div>
			</div>
		</div>
	</div>


	<div class="row" id="test" align="center">	
	</div>
	<hr>

</body>
</html>