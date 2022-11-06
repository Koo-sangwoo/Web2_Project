package com.shopping.web2.vo;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class BoardVO {
	private String title;
	private String content;
	private String createDate;
	private String pname;
	private String cusname;
}
