package com.java.hotelmanagemnt.HotelManagement.iRegistrationValidation;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.hotelmanagemnt.HotelManagement.RegistartionEnum.ValidationResponseMessage;
import com.java.hotelmanagemnt.HotelManagement.RegistrationCustomException.CustomExceptionforRegistartion;
import com.java.hotelmanagemnt.HotelManagement.RegistrationRepository.RegistrationRepository;
import com.java.hotelmanagemnt.HotelManagement.Registrationdto.Registrationdto;
import com.java.hotelmanagemnt.HotelManagement.User_Registration.UserRegistration;

public class UserRegistrationValidation {
	
	@Autowired
	RegistrationRepository registrationRepository;
	
	public CustomExceptionforRegistartion uservalidationofID(Long id){
		List<UserRegistration> listuserRegistered = registrationRepository.findAll();
		
		long count = listuserRegistered.stream().filter(user -> user.getId().equals(id)).count();
		
		if(count == 0)
			return new CustomExceptionforRegistartion(ValidationResponseMessage.InvalidID.toString(),"Please enter the numeric ID", "143673");
		
		return null;
	}
	
	public CustomExceptionforRegistartion userValidationrequestObject(Registrationdto dto) {
		List<String> validatefields = ValidateFields(dto);
		String message = null;
		
		for (String fieldname : validatefields) {
			message = message+","+fieldname;
		}
		if (message != null)
			return new CustomExceptionforRegistartion(message, "Enter the request fields properly", null);
		else
			return null;
	}
	
	public List<String> ValidateFields(Registrationdto dto){
		List<String> validatedFieldStatus = new LinkedList();
		
		if(dto.getAge() == 0 && dto.getAge()>=70 && dto.getAge()<=5)
			validatedFieldStatus.add(ValidationResponseMessage.InValidAge.toString());
		if(!dto.getEmail().contains("@gmail.com"))
			validatedFieldStatus.add(ValidationResponseMessage.Invalidmail.toString());
		
		return validatedFieldStatus;
	}
}
