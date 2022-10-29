/**
 * 
 */

	function deleteCarts(cartId) {
		if (confirm("삭제하시겠습니까?")) {
			location.href = "/cartDelete?cartId="+cartId;
		} else {
			location.href = "/cart?memberId=asdf";

		}
	}
	

	
 
 
 
  function check(regExp, e, msg){
	if(e.value.length !=0 && regExp.test(e.value)){
		return true;
	} 
	alert(msg);
	e.select();
	e.focus();
	return false;
	
}
 function checkAddProduct(frm){
	var productId = document.getElementById("productId");	//상품아이디
	var pname = document.getElementById("pname");	//상품명
	var price = document.getElementById("price");	//가격
	var unitStock = document.getElementById("unitstock");	//재고수

	//아이디 체크 P0001~P00000000001 P로 시작해서 5~12자리
	
	if(!check(/^P[0-9]{4,11}$/,productId,"P로 시작하고 숫자로 되어있는 5~12자리 코드를 입력해주세요")) {
		return false;
	} else if (!check(/^[a-zA-Z가-힣]*$/,pname,"상품명은 한글 또는 영문으로 입력해주세요")){
		return false;
	} else if (!check(/^[1-9][0-9]{3,}$/,price,"네 자리수 이상 숫자로 작성해주세요")) {	// 4자리 이상
		return false;
	} else if (!check(/^[0-9]*$/,unitStock, "숫자로 작성해주세요")) {
		return false;
	} else{
		frm.submit();
	}
}
 