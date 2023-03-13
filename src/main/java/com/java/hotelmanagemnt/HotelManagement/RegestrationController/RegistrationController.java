package com.java.hotelmanagemnt.HotelManagement.RegestrationController;

import java.util.List;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.java.hotelmanagemnt.HotelManagement.RegistrationCustomException.CustomExceptionforRegistartion;
import com.java.hotelmanagemnt.HotelManagement.Registrationdto.Registrationdto;
import com.java.hotelmanagemnt.HotelManagement.User_Registration.UserRegistration;
import com.java.hotelmanagemnt.HotelManagement.iRegistrationServices.iRegistrationService;
import com.java.hotelmanagemnt.HotelManagement.iRegistrationValidation.UserRegistrationValidation;
import com.java.hotelmanagemnt.HotelManagement.iRgestrationController.iRegistrationController;

public class RegistrationController implements iRegistrationController {
	
	@Autowired
	iRegistrationService iRegistrationService;
	
	@Autowired
	UserRegistrationValidation userRegistrationValidation;

	@Override
	public ResponseEntity<UserRegistration> getUserRegisetred(Long id) {
		CustomExceptionforRegistartion customExceptionforRegistartion = 
									userRegistrationValidation.uservalidationofID(id);
		
		if (customExceptionforRegistartion != null)
			throw customExceptionforRegistartion;
		
		return iRegistrationService.getUserRegistration(id);
	}

	@Override
	public ResponseEntity<UserRegistration> saveUserRegister(Registrationdto dto) {
		CustomExceptionforRegistartion customExceptionforRegistartion = 
										userRegistrationValidation.userValidationrequestObject(dto);
		
		if (customExceptionforRegistartion != null)
			throw customExceptionforRegistartion;
		
		return iRegistrationService.saveUserRegistrationdata(dto);
	}

	@Override
	public ResponseEntity<UserRegistration> updateUserRegistration(Registrationdto registrationdto) {
		CustomExceptionforRegistartion customExceptionforRegistartion = 
				userRegistrationValidation.userValidationrequestObject(registrationdto);
		
		if(customExceptionforRegistartion != null)
			throw customExceptionforRegistartion;
		
		return iRegistrationService.updateUserRegistrationdata(registrationdto);
	}

	@Override
	public String deleteUserRegistration(Long id) {
		CustomExceptionforRegistartion customExceptionforRegistartion = 
				userRegistrationValidation.uservalidationofID(id);
		
		if(customExceptionforRegistartion != null)
			throw customExceptionforRegistartion;
		
		return iRegistrationService.deletUserregistration(id);
	}

	@Override
	public List<UserRegistration> getAllUserRegistration() {
		
		return iRegistrationService.getAllUserRegistration();
	}

}
