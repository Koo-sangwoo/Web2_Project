package com.shopping.web2.vo;

import lombok.Data;

// 테이블과 1:1로 매핑되는 데이터 객체 POJO 순수한 데이터 클래스
@Data
public class CartVO {
	private int cartId;
	private String memberId;
	private String productId;
	private int quantity;
	private String size;
	@Override
	public String toString() {
		return "CartVO [cartId=" + cartId + ", memberId=" + memberId + ", productId=" + productId + ", quantity="
				+ quantity + ", size=" + size + "]";
	}

	

}
