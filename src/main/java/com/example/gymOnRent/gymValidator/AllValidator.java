package com.example.gymOnRent.gymValidator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.example.gymOnRent.gymController.gymController;
import com.example.gymOnRent.gymDao.gymDao;
import com.example.gymOnRent.gymDto.UserSignUpDto;
import com.example.gymOnRent.gymService.gymService;


@Component
@ControllerAdvice(assignableTypes = gymController.class)
public class AllValidator implements Validator{

	@Autowired
	private gymService gymSrv;
	private int ClassValidateCheck=0;
	
	@Override
	public boolean supports(Class<?> clazz) {
		ClassValidateCheck =0;
		return gymDao.class.equals(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		if(ClassValidateCheck == 0) {
			UserSignUpDto user = (UserSignUpDto) target;
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Name", "correct");
			if(user.getName() == null) {
				errors.rejectValue("Name", "Required");
			}
			
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Email", "correct");
			if(user.getEmail() == null) {
				errors.rejectValue("Email", "Required");
			}
			
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userName", "correct");
			if(user.getUserName() == null) {
				errors.rejectValue("userName", "Required");
			}
			
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Password", "correct");
			if(user.getPassword() == null) {
				errors.rejectValue("Password", "Required");
			}
			
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "Gender", "correct");
			if(user.getGender() == null) {
				errors.rejectValue("Gender", "Required");
			}
		}
		
	}

}

