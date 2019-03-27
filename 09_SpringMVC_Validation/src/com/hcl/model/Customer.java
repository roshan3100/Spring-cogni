package com.hcl.model;

import java.util.Date;

public class Customer {
	
	private String userName;
	private String address;
	private String password;
	private String confirmPassword;
	private Date date_of_birth;
	private Boolean receiveNewsLetter;
	private String[]favFrameworks;
	private String favSport;
	private String sex;
	private String country;
	private String[]  javaSkills;
	private String secretValue;
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
	public Date getDate_of_birth() {
		return date_of_birth;
	}
	public void setDate_of_birth(Date date_of_birth) {
		this.date_of_birth = date_of_birth;
	}
	public Boolean getReceiveNewsLetter() {
		return receiveNewsLetter;
	}
	public void setReceiveNewsLetter(Boolean receiveNewsLetter) {
		this.receiveNewsLetter = receiveNewsLetter;
	}
	public String[] getFavFrameworks() {
		return favFrameworks;
	}
	public void setFavFrameworks(String[] favFrameworks) {
		this.favFrameworks = favFrameworks;
	}
	public String getFavSport() {
		return favSport;
	}
	public void setFavSport(String favSport) {
		this.favSport = favSport;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String[] getJavaSkills() {
		return javaSkills;
	}
	public void setJavaSkills(String[] javaSkills) {
		this.javaSkills = javaSkills;
	}
	public String getSecretValue() {
		return secretValue;
	}
	public void setSecretValue(String secretValue) {
		this.secretValue = secretValue;
	}
	
	
	
	

}
