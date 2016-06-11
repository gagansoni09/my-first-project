package com.aartek.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.UserLogin;
import com.aartek.service.LoginService;




@Controller
public class LoginController {
	@Autowired
	private LoginService loginService;

	@RequestMapping(value = "/UserLogin", method = RequestMethod.GET)
	public String showLogin(Map<String, Object> map) {
		map.put("UserLogin", new UserLogin());
		return "login";
	}

	@RequestMapping(value = "/saveUser", method = RequestMethod.POST)
	public String saveUser(@ModelAttribute("UserLogin") UserLogin login,ModelMap model) {
		model.addAttribute("invalid","UserName and Password is invailid");
		System.out.println("inside controller's save");
		System.out.println(login.getEmailID()+" "+"email in loginController");
		System.out.println(login.getPassword()+" "+"pass in loginController");
		
		boolean loginStatus=loginService.userSignIn(login); 
		System.out.println(loginStatus);
		if(loginStatus==false){
			/*model.put("invalid", "UserName and Password is invailid");*/
			System.out.println("controller if cond");
			return "login";
		}
		else{
			System.out.println("else part");
		return "welcome";
	}}

	/*public String signInAction(@ModelAttribute("UserLogin") UserLogin login) {
		System.out.println(login.getEmailID());
		login=loginService.userSignIn(login);
		return "login";

	}*/
}
