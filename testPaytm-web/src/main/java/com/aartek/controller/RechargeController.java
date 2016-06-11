package com.aartek.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aartek.model.UserRecharge;
import com.aartek.service.RechargeService;

@Controller
public class RechargeController {
	@Autowired
	private RechargeService rechargeservice;
	
	/*@RequestMapping(value="/saveRecharge",method=RequestMethod.POST, method=RequestMethod.GET)
	public String saveRecharge(Map<String,Object> map,@ModelAttribute("UserRecharge") UserRecharge rech, ModelMap model){
		map.put("UserRecharge", new UserRecharge());
		System.out.println("inside controler");
		List<UserRecharge> l=rechargeservice.rechargeSignin(rech);
		System.out.println(l);
		if(l.size()!=0){
			model.addAttribute("list", l);
			
			return "recharge";
			
		}
		
		else{
			return null;
		}
		
	}*/
	
	@RequestMapping(value="/myRecharge",method=RequestMethod.GET)
	public String showRecharge(Map<String,Object> map,ModelMap mm){
		map.put("UserRecharge", new UserRecharge());
		Object[] o=rechargeservice.getDisplayTag();
		mm.addAttribute("arr",o);
		return "recharge";
	}
	
	@RequestMapping(value="/saveRecharge",method=RequestMethod.POST)
	public String saveRecharge(@ModelAttribute("UserRecharge") UserRecharge rech, ModelMap model){
		System.out.println("inside controler");
		List<UserRecharge> l=rechargeservice.rechargeSignin(rech);
		System.out.println(l);
		if(l.size()!=0){
			model.addAttribute("list", l);
			
			return "recharge";
			
		}
		
		else{
			return null;
		}
		
			}
	
	

}
