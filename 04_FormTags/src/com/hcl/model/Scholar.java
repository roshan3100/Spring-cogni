package com.hcl.model;

import java.util.List;

public class Scholar {

	private String scholarName;
	private String password;
	private String gender;
	private String countryName;
	private List countryList;
	private String aboutYou;
	private String[] games;
	private List sportList;
	private Boolean suscribe;

	public String getScholarName() {
		return scholarName;
	}

	public void setScholarName(String scholarName) {
		this.scholarName = scholarName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public List getCountryList() {
		return countryList;
	}

	public void setCountryList(List countryList) {
		this.countryList = countryList;
	}

	public String getAboutYou() {
		return aboutYou;
	}

	public void setAboutYou(String aboutYou) {
		this.aboutYou = aboutYou;
	}

	

	public String[] getGames() {
		return games;
	}

	public void setGames(String[] games) {
		this.games = games;
	}

	public List getSportList() {
		return sportList;
	}

	public void setSportList(List sportList) {
		this.sportList = sportList;
	}

	public Boolean getSuscribe() {
		return suscribe;
	}

	public void setSuscribe(Boolean suscribe) {
		this.suscribe = suscribe;
	}

}
