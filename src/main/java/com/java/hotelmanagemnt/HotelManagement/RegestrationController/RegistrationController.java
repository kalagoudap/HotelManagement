package com.java.hotelmanagemnt.HotelManagement.RegestrationController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.java.hotelmanagemnt.HotelManagement.RegistrationCustomException.CustomExceptionforRegistartion;
import com.java.hotelmanagemnt.HotelManagement.Registrationdto.Registrationdto;
import com.java.hotelmanagemnt.HotelManagement.User_Registration.UserRegistration;
import com.java.hotelmanagemnt.HotelManagement.iRegistrationServices.iRegistrationService;
import com.java.hotelmanagemnt.HotelManagement.iRegistrationValidation.UserRegistrationValidation;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/registration")
@RestController
public class RegistrationController{
	
	@Autowired
	iRegistrationService iRegistrationService;
	
	@Autowired
	UserRegistrationValidation userRegistrationValidation;

	@GetMapping("/user/get/{id}")
	public ResponseEntity<UserRegistration> getUserRegisetred(@PathVariable Long id) {
		CustomExceptionforRegistartion customExceptionforRegistartion = 
									userRegistrationValidation.uservalidationofID(id);
		
		if (customExceptionforRegistartion != null)
			throw customExceptionforRegistartion;
		
		return iRegistrationService.getUserRegistration(id);
	}
	@PostMapping("/user/save")
	public ResponseEntity<UserRegistration> saveUserRegister(@RequestBody Registrationdto dto) {
		CustomExceptionforRegistartion customExceptionforRegistartion = 
										userRegistrationValidation.userValidationrequestObject(dto);
		
		if (customExceptionforRegistartion != null)
			throw customExceptionforRegistartion;
		
		return iRegistrationService.saveUserRegistrationdata(dto);
	}
	@PutMapping("/user/update")
	public ResponseEntity<UserRegistration> updateUserRegistration(@RequestBody Registrationdto registrationdto) {
		CustomExceptionforRegistartion customExceptionforRegistartion = 
				userRegistrationValidation.userValidationrequestObject(registrationdto);
		
		if(customExceptionforRegistartion != null)
			throw customExceptionforRegistartion;
		
		return iRegistrationService.updateUserRegistrationdata(registrationdto);
	}
	@DeleteMapping("/user/delete")
	public String deleteUserRegistration(@PathVariable Long id) {
		CustomExceptionforRegistartion customExceptionforRegistartion = 
				userRegistrationValidation.uservalidationofID(id);
		
		if(customExceptionforRegistartion != null)
			throw customExceptionforRegistartion;
		
		return iRegistrationService.deletUserregistration(id);
	}

	@GetMapping("/Users/getall")
	public List<UserRegistration> getAllUserRegistration() {
		
		return iRegistrationService.getAllUserRegistration();
	}

}
