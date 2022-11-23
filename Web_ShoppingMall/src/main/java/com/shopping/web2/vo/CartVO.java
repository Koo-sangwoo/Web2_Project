package com.shopping.web2.vo;

import lombok.Data;

// ���̺�� 1:1�� ���εǴ� ������ ��ü POJO ������ ������ Ŭ����
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
