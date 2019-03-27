package com.hcl.controller;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hcl.domain.User;
import com.hcl.utility.DBUtility;

public class Test {
	
	public static void main(String[] args) {
		Connection connection=null;
		
		
		List<User> users = new ArrayList<User>();
		
		
		users = new ArrayList<User>();
		try {
			connection = DBUtility.getConnection();
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from tblUser");
			System.out.println(rs.getFetchSize());
			while (rs.next()) {
				/*User user = new User();
				user.setUserid(rs.getInt("userid"));
				user.setFirstName(rs.getString("firstname"));
				user.setLastName(rs.getString("lastname"));				
				user.setEmail(rs.getString("email"));*/
				System.out.println("print");			//users.add(user);
				System.out.println(rs.getInt("USERID")+" "+rs.getString("FIRSTNAME")+" "+rs.getString("LASTNAME")+" "+rs.getString("EMAIL"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("user list "+users.size());
		
		}
	}

