package com.hcl.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.hcl.model.Country;
import com.hcl.model.Sport;

@Service
public class ScholarService {
	
	public List<Country> getCountryList(){
		
		ArrayList<Country> countryList = new ArrayList<Country>();
		
		Country country1 = new Country("India","India");
		Country country2 = new Country("USA","USA");
		Country country3 = new Country("China","China");
		
		countryList.add(country1);
		countryList.add(country2);
		countryList.add(country3);
		
		return countryList;
		
		
	}
	
	public List<Sport>getSportsList(){
		
		ArrayList<Sport>sportList = new ArrayList<Sport>();
		
		Sport sport1 = new Sport("cricket","cricket");
		Sport sport2 = new Sport("hockey","hockey");
		Sport sport3 = new Sport("football","football");
		Sport sport4 = new Sport("tennis","tennis");
		
		sportList.add(sport1);
		sportList.add(sport2);
		sportList.add(sport3);
		sportList.add(sport4);
		
		return sportList;
		
		
	}

}
