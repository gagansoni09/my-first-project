package com.aartek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.UserRegister;
import com.aartek.repository.RegRepository;

@Service
public class RegisterService {
	@Autowired
	private RegRepository regRepository;
	
	public boolean registerSignin(UserRegister reg){
		System.out.println(reg.getEmailID() +"inside service");
		UserRegister regMember=regRepository.showRegData(reg);
		if(regMember==null){
			return false;
		}
		else{
		return true;
	}}
	

}
