package com.hcl.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import com.hcl.domain.User;
import com.hcl.utility.DBUtility;



@Service
public class UserService {
	
	private Connection connection;

	public UserService() {
		connection = DBUtility.getConnection();
		if(connection!=null){
			System.out.println("Database connected");
		}
	}
	

	public List<User> getAllUsers() {
		List<User> users = null;
		if(connection!=null){
		System.out.println("getAllUsers()");
		users = new ArrayList<User>();
		try {
			Statement statement = connection.createStatement();
			ResultSet rs = statement.executeQuery("select * from tblUser");
			while (rs.next()) {
				User user = new User();
				user.setUserid(rs.getInt("userid"));
				user.setFirstName(rs.getString("firstname"));
				user.setLastName(rs.getString("lastname"));				
				user.setEmail(rs.getString("email"));
				System.out.println(rs.getInt("USERID")+" "+rs.getString("FIRSTNAME")+" "+rs.getString("LASTNAME")+" "+rs.getString("EMAIL"));
				users.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("user list "+users.size());
		return users;
		}else{
			System.out.println("Connection not established");	
			return  users; 
		}
	}
	
	public User getUserById(int userId) {
		System.out.println("getUserById()" +userId);
		User user = new User();
		try {
			PreparedStatement preparedStatement = connection.
					prepareStatement("select * from tblUser where USERID=?");
			preparedStatement.setInt(1, userId);
			ResultSet rs = preparedStatement.executeQuery();
			
			if (rs.next()) {
				user.setUserid(rs.getInt("USERID"));
				user.setFirstName(rs.getString("FIRSTNAME"));
				user.setLastName(rs.getString("LASTNAME"));
				user.setEmail(rs.getString("EMAIL"));
				
				System.out.println(rs.getInt("USERID")+" "+rs.getString("FIRSTNAME")+" "+rs.getString("LASTNAME")+" "+rs.getString("EMAIL"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return user;
	}

}

