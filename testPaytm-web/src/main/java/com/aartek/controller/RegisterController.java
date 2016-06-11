package com.aartek.controller;

import java.util.Map;

import javax.imageio.spi.RegisterableService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.UserRegister;
import com.aartek.service.RegisterService;
import com.aartek.validator.RegisterValidator;


@Controller
public class RegisterController {
	@Autowired
	private RegisterService registerservice; 
	
	@Autowired
	private RegisterValidator registervalidator;
	
	@RequestMapping(value = "/myRegister", method = RequestMethod.GET)
	public String showRegister(Map<String, Object> map) {
		map.put("UserRegister", new UserRegister());
		return "register";
	}
	@RequestMapping(value="/saveRegister" , method = RequestMethod.POST)
	public String saveUserReg(@ModelAttribute("UserRegister") UserRegister reg,BindingResult result,ModelMap model){
		System.out.println("inside controller");
		registervalidator.validate(reg,result);
		if(result.hasErrors()){
			System.out.println("has error");
			return "register";
		}
		else{
		System.out.println(reg.getFname());
		
		boolean status= registerservice.registerSignin(reg);
		if(status==true){
			return "redirect:/UserLogin.do";
			
		}
		else{
		return "redirect:/myRegister.do";
		}
		
	}}
	
	

}
