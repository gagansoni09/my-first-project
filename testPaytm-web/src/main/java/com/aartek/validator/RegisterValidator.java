package com.aartek.validator;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.aartek.model.UserRegister;

@Component
public class RegisterValidator implements Validator {
	
	public boolean supports(Class<?> clazz) {
		return UserRegister.class.isAssignableFrom(clazz);
	}
	public void validate(Object target,Errors errors){
		
		UserRegister us=(UserRegister)target;
		System.out.println("validation class");
		/*ValidationUtils.rejectIfEmpty(errors, "fname","error.fname.empty");
		ValidationUtils.rejectIfEmpty(errors, "lname","error.lname.empty");
		ValidationUtils.rejectIfEmpty(errors, "mobno","error.mobno.empty");
		ValidationUtils.rejectIfEmpty(errors, "emailID","error.emailID.empty");
		ValidationUtils.rejectIfEmpty(errors, "Password","error.Password.empty");*/
		
		ValidationUtils.rejectIfEmpty(errors, "fname","error.fname.empty","Please enter your first name");
		ValidationUtils.rejectIfEmpty(errors, "lname","error.lname.empty","Please enter last name");
		ValidationUtils.rejectIfEmpty(errors, "mobno","error.mobno.empty","Please enter mobile number");
		ValidationUtils.rejectIfEmpty(errors, "emailID","error.emailID.empty","Please enter email Id");
		ValidationUtils.rejectIfEmpty(errors, "Password","error.Password.empty","Please enter your password");
	}
	

}
