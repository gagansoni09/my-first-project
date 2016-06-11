package com.aartek.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.UserLogin;
import com.aartek.repository.LoginRepository;

@Service
public class LoginService {
	@Autowired
	private LoginRepository loginRepository;
	
	public boolean userSignIn(UserLogin login) {
		//UserLogin userLogin = (UserLogin) login;
		System.out.println(login.getEmailID()+" "+"in LoginService");
		
		 //List<Object> loginMember;
		System.out.println(login.getEmailID()+" "+login.getPassword());
		List<Object> loginMember=loginRepository.showData(login);
		if(loginMember.size()==0){
			return false;
		}
		else{
		return true;
	}}

}
