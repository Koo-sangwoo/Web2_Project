<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js">	
</script>
<script type="text/javascript">
// 카카오결제
$(function(){
	$("#btn-kakao-pay").click(function(){
		
		
		// 카카오페이 결제전송
		$.ajax({
			type:'get'
			,url:'/order/pay'
			,data:{
				total_amount: 100
				,payUserName: 200
				,sumPrice:300
				,discountPrice:400
				,totalPrice:500
				,tel:600
				,email:700
				,usePoint:800
				,useCouponNo:900	
				
			},
			success:function(response){
				location.href = response.next_redirect_pc_url			
			}
		})
	})
})
</script>
</head>
<body>
<input type="button" id = "btn-kakao-pay" value="결재요청">
</body>
</html>