package com.aartek.repository;

import java.util.List;

import org.hibernate.SQLQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.aartek.model.UserRecharge;

@Repository
public class RechargeRepo {
	
	@Autowired
	private HibernateTemplate hibernatetemplate;
	
	public List<UserRecharge> saveRecharge(UserRecharge rech){
		System.out.println(rech.getAmount()+ " inside Repo");
		
		if(rech!=null){
			hibernatetemplate.save(rech);
			System.out.println("save successful");
			List<UserRecharge> ur=hibernatetemplate.find("from UserRecharge");
			System.out.println("got data");
			return ur;
		}
		 else{
		return null;
	}
	}
	
	public List<Object> displayTag(){
		SQLQuery q=hibernatetemplate.getSessionFactory().openSession().createSQLQuery("select * from displaytag");
		List<Object>q1=q.list();
		System.out.println("q is= "+ q1);
		return q1;
	}
}
