package com.aartek.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.UserLogin;
import com.aartek.model.UserRegister;

@Repository
public class RegRepository {

	@Autowired
	private HibernateTemplate hibernatetemplate;

	public UserRegister showRegData(UserRegister reg){
		System.out.println(reg.getMobno()+" "+"in repository");
		//List<Object> l=hibernatetemplate.find("from UserLogin al where al.emailID=? and al.password=?",login.getEmailID(),login.getPassword());
		System.out.println("login check");
		if(reg!=null){
		hibernatetemplate.save(reg);
		System.out.println("save successfull");
		return reg;
	}else{
		return null;
	}
}}
