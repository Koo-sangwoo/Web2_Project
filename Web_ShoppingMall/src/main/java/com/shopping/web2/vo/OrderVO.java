package com.shopping.web2.vo;

import lombok.Data;

@Data
public class OrderVO {
private int memberId;
private int cartId;
private int orderId;
private int quantity;
private String size;
private String address;
private String name;
private String phonenumber;
private String email;
}
