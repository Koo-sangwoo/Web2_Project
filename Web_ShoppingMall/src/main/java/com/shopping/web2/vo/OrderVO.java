package com.shopping.web2.vo;

import lombok.Data;

@Data
public class OrderVO {
	   private int orderId;
		private String address;
		private String memberId;
		private String size;
		
		
		@Override
		public String toString() {
			return "OrderVO [orderId=" + orderId + ", address=" + address + ", memberId=" + memberId + "]";
		}
		

}