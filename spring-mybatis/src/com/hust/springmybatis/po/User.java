package com.hust.springmybatis.po;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 因为加了二级缓存 所以要序列化
 * @author yexx
 * @version 1.0
 */
public class User implements Serializable{
	private int id;
	private String username;
	private String sex;
	private Date birthday;
	private String address;

	private List<Orders> orderList;

	public List<Orders> getOrderList() {
		return orderList;
	}

	public void setOrderList(List<Orders> orderList) {
		this.orderList = orderList;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", sex=" + sex + ", birthday=" + birthday + ", address="
				+ address + ", orderList=" + orderList + "]";
	}
}
