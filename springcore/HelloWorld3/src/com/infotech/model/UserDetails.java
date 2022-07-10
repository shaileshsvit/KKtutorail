package com.infotech.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("userBean")
public class UserDetails {

	@Value("${UserDetails.userName}")
	private String userName;
	
	@Value("${UserDetails.password}")
	private String password;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}