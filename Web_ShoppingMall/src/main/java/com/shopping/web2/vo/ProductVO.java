package com.shopping.web2.vo;

public class ProductVO {

	private String productId;
	private String pname;
	private String price;  
	private String pdesc;  
	private String category; 
	private String filename;
	private String registday;
	private String SunitStock;
	private String MunitStock;
	private String LunitStock;
	private String XLunitStock;
	@Override
	public String toString() {
		return "ProductVO [productId=" + productId + ", pname=" + pname + ", price=" + price + ", pdesc=" + pdesc
				+ ", category=" + category + ", filename=" + filename + ", registday=" + registday
				+ ", SunitStock=" + SunitStock + ", MunitStock=" + MunitStock + ", LunitStock=" + LunitStock
				+ ", XLunitStock=" + XLunitStock + "]";
	}
	
	
}
