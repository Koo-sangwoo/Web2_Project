package com.shopping.web2.vo;

import java.sql.Date;

public class MemberVO {

	private String memberId; 	//아이디
	private String password;	//비밀번호
	private String name;		//이름
	private String address;		//주소
	private String phonenumber;	//전화번호
	private String membership;	//멤버십
	private Date regiDate;		//가입날짜
	private String email;		//이메일
	
	
	public String getMemberId() {
		return memberId;
	}
	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getMembership() {
		return membership;
	}
	public void setMembership(String membership) {
		this.membership = membership;
	}
	public Date getRegiDate() {
		return regiDate;
	}
	public void setRegiDate(Date regiDate) {
		this.regiDate = regiDate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "MemberVO [memberId=" + memberId + ", password=" + password + ", name=" + name + ", address=" + address
				+ ", phonenumber=" + phonenumber + ", membership=" + membership + ", regiDate=" + regiDate + ", email="
				+ email + "]";
	}
}
