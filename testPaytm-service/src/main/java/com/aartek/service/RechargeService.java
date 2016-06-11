package com.aartek.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.UserRecharge;
import com.aartek.repository.RechargeRepo;


@Service
public class RechargeService {
	
	@Autowired
	private RechargeRepo rechargerepo;
	Object[] o;
	
	public List<UserRecharge> rechargeSignin(UserRecharge rech){
		System.out.println(rech.getMobno() +"inside service");
		
	List<UserRecharge> ur=(List<UserRecharge>) rechargerepo.saveRecharge(rech);
	
	if(ur.size()==0){
		return null;
	}
	else{
		return ur;
	}
	}
	
	public Object[] getDisplayTag(){
		List<Object>list=rechargerepo.displayTag();
		Iterator<Object> it=list.iterator();
		while(it.hasNext()){
			o=(Object[])it.next();
			System.out.println("object array "+o[1]+" "+o[2]);
			
		}
		return o;
	}

}
