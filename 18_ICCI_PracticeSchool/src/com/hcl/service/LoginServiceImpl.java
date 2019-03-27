package com.hcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.dao.LoginDao;
import com.hcl.model.LoginTo;

@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginDao loginDao;
	
	@Override
	@Transactional
	public int addUser(LoginTo loginTo) {
	return  loginDao.addUser(loginTo);
		
	}

	@Override
	@Transactional
	public LoginTo getUserById(Integer userId) {
		
		return loginDao.getUserById(userId);
	}

}
