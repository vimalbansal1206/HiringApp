package com.hcl.hiring.hiringapp.security;

import javax.validation.constraints.NotBlank;

public class LoginRequest {
	@NotBlank
	private String userName;

	@NotBlank
	private String password;

	

	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
