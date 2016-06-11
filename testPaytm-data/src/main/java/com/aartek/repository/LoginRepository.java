package com.aartek.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.UserLogin;

@Repository
public class LoginRepository {
	
	@Autowired
	private HibernateTemplate hibernatetemplate;

	public List<Object> showData(UserLogin login){
		System.out.println(login.getEmailID()+" "+"in repository" +login);
		List<Object> l=hibernatetemplate.find("from UserRegister al where al.emailID=? and al.Password=?",login.getEmailID(),login.getPassword());
		System.out.println("login check");
		return l;
	}
	/*public List<Object>showData(UserLogin login){
		String emailId=login.getEmailID();
		String password=login.getPassword();
		System.out.println("repo");
		List<Object> userLogin=(List<Object>) hibernatetemplate.find("from UserLogin al where al.emailID=? and al.password=?",emailId,password);
		//hibernatetemplate.save("login");
		System.out.println("save object");
		return userLogin;
	}*/
}
