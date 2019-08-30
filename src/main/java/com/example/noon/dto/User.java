package com.example.noon.dto;

import java.util.Date;

public class User {

	private Integer id;
	private String userName;
	private Date createdDate;
	private boolean isMembershipActive;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public boolean isMembershipActive() {
		return isMembershipActive;
	}

	public void setMembershipActive(boolean isMembershipActive) {
		this.isMembershipActive = isMembershipActive;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", createdDate=" + createdDate + ", isMembershipActive="
				+ isMembershipActive + "]";
	}

}
