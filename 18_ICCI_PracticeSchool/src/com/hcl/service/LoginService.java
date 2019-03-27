package com.hcl.service;

import com.hcl.model.LoginTo;

public interface LoginService {
	
	public int addUser(LoginTo loginTo);
	public LoginTo getUserById(Integer userId);
}
