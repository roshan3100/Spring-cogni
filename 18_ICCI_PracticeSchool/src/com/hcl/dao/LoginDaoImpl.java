package com.hcl.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.entity.Login;
import com.hcl.model.LoginTo;
@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public int addUser(LoginTo loginTo) {
		
		
		Login login = new Login();
		
		
		login.setUserName(loginTo.getUserName());
		login.setPassword(loginTo.getPassword());
		login.setRole(loginTo.getRole());
	
		sessionFactory.getCurrentSession().save(login);
		
		return login.getUserId();
		
	}
	
	  @Override
	    @SuppressWarnings("unchecked")
	    public LoginTo getUserById(Integer userId) {
	        Session session = sessionFactory.getCurrentSession();
	        List<Login> list = session.createQuery("from Login l where l.userId = :uid")
	            .setParameter("uid", userId).list();
	       // return list.size() > 0 ?(Book)list.get(0): null;
	        if(list.size()!=0){
	        	Login login =(Login)list.get(0);
	        	
	        	System.out.println("Database  username: "+login.getUserName());
	    		System.out.println("database  password: "+login.getPassword());
	        	LoginTo loginTo = new LoginTo();
	        	
	        	loginTo.setUserId(login.getUserId());
	        	loginTo.setUserName(login.getUserName());
	        	loginTo.setPassword(login.getPassword());	        	
	        	return loginTo;
	        }else{
	        	return null;
	        }
	    }

}
