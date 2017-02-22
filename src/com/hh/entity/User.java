package com.hh.entity;

public class User {
	private String Uid;//用户ID1111我曹看看可不可以提交
	private String Uaccount;//用户账号
	private String Upassword;//用户密码
	
	public User(String uid, String uaccount, String upassword) {
		super();
		Uid = uid;
		Uaccount = uaccount;
		Upassword = upassword;
	}
	
	public String toString() {
		return "User [Uid=" + Uid + ", Uaccount=" + Uaccount + ", Upassword="
				+ Upassword + "]";
	}

	public String getUid() {
		return Uid;
	}
	public void setUid(String uid) {
		Uid = uid;
	}
	public String getUaccount() {
		return Uaccount;
	}
	public void setUaccount(String uaccount) {
		Uaccount = uaccount;
	}
	public String getUpassword() {
		return Upassword;
	}
	public void setUpassword(String upassword) {
		Upassword = upassword;
	}
	
}
