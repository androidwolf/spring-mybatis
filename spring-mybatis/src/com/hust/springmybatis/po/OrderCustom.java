package com.hust.springmybatis.po;

/**
 * 
 * @author	yexx
 * @version 1.0
 */
public class OrderCustom extends Orders {
	
	private String username;
	
	private String sex;
	
	private String address;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return super.toString() + "OrderCustom [username=" + username + ", sex=" + sex
				+ ", address=" + address + "]";
	}
	
	

}
