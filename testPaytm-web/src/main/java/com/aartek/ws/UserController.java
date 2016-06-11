package com.aartek.ws;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	
	
	
	@RequestMapping(value="/get/{a}" , method=RequestMethod.GET)
	@ResponseBody
	public Integer getUserDetail(@PathVariable ("a") int i){
		System.out.println("nuber multiplication");
		int k=100;
		int x=k*i;
		
		return x;
	}

}
