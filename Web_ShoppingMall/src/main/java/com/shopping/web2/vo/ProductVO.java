package com.shopping.web2.vo;

public class ProductVO {

	private String productId;
	private String pname;
	private String price;  
	private String pdesc;  
	private String category; 
	private String filenamemember;
	private String regist_date;
	private String SunitStock;
	private String MunitStock;
	private String LunitStock;
	private String XLunitStock;
	@Override
	public String toString() {
		return "ProductVO [productId=" + productId + ", pname=" + pname + ", price=" + price + ", pdesc=" + pdesc
				+ ", category=" + category + ", filenamemember=" + filenamemember + ", regist_date=" + regist_date
				+ ", SunitStock=" + SunitStock + ", MunitStock=" + MunitStock + ", LunitStock=" + LunitStock
				+ ", XLunitStock=" + XLunitStock + "]";
	}
}
