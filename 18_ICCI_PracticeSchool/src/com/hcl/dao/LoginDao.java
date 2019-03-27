package com.hcl.dao;

import com.hcl.model.LoginTo;

public interface LoginDao {
	
	public int addUser(LoginTo loginTo);
	public LoginTo getUserById(Integer userId);

}
