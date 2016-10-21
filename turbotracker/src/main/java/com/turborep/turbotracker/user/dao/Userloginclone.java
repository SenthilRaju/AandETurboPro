package com.turborep.turbotracker.user.dao;

// Generated Jan 23, 2012 5:39:26 PM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Userloginclone generated by hbm2java
 */
@Entity
@Table(name = "UserLoginClone", catalog = "")
public class Userloginclone implements java.io.Serializable {

	private int userLoginId;
	private String loginName;
	private String loginPassword;
	private String fullName;
	private String initials;

	public Userloginclone() {
	}

	public Userloginclone(int userLoginId) {
		this.userLoginId = userLoginId;
	}

	public Userloginclone(int userLoginId, String loginName,
			String loginPassword, String fullName, String initials) {
		this.userLoginId = userLoginId;
		this.loginName = loginName;
		this.loginPassword = loginPassword;
		this.fullName = fullName;
		this.initials = initials;
	}

	@Id
	@Column(name = "UserLoginID", unique = true, nullable = false)
	public int getUserLoginId() {
		return this.userLoginId;
	}

	public void setUserLoginId(int userLoginId) {
		this.userLoginId = userLoginId;
	}

	@Column(name = "LoginName", length = 15)
	public String getLoginName() {
		return this.loginName;
	}

	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}

	@Column(name = "LoginPassword", length = 50)
	public String getLoginPassword() {
		return this.loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	@Column(name = "FullName", length = 50)
	public String getFullName() {
		return this.fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	@Column(name = "Initials", length = 6)
	public String getInitials() {
		return this.initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

}