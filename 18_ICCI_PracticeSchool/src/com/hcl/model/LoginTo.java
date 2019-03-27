package com.hcl.model;

import org.springframework.stereotype.Component;

@Component
public class LoginTo {

	private Integer userId;
	private String userName;
	private String password;
	private String confirmPassword;
	private String role;
	private String randomCode;
	private String enterCode;
	
	private String message;
	
	public LoginTo(){
		generateRandom();
	}
	
	public void generateRandom()
	{
		randomCode = (((int)(Math.random() * 1000)) + 1) + "";
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
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
	public String getConfirmPassword() {
		return confirmPassword;
	}
	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getRandomCode() {
		return randomCode;
	}
	public void setRandomCode(String randomCode) {
		this.randomCode = randomCode;
	}
	public String getEnterCode() {
		return enterCode;
	}
	public void setEnterCode(String enterCode) {
		this.enterCode = enterCode;
	}
	
	
	

}
