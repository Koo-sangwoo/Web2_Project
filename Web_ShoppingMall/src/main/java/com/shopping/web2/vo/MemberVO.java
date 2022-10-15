package com.shopping.web2.vo;

import java.sql.Date;

public class MemberVO {

	private String memberId; 	//���̵�
	private String password;	//��й�ȣ
	private String name;		//�̸�
	private String address;		//�ּ�
	private String phonenumber;	//��ȭ��ȣ
	private String membership;	//�����
	private Date regiDate;		//���Գ�¥
	private String email;		//�̸���
	
	
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
