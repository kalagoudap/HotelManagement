package com.java.hotelmanagemnt.HotelManagement.iRegistrationServices;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.java.hotelmanagemnt.HotelManagement.Registrationdto.Registrationdto;
import com.java.hotelmanagemnt.HotelManagement.User_Registration.UserRegistration;

@Service
public interface iRegistrationService {
	
	public ResponseEntity<UserRegistration> getUserRegistration(Long id);
	
	public List<UserRegistration> getAllUserRegistration();
	
	public ResponseEntity<UserRegistration> saveUserRegistrationdata(Registrationdto dto);
	
	public ResponseEntity<UserRegistration> updateUserRegistrationdata(Registrationdto dto);
	
	public ResponseEntity<UserRegistration> patchUserRegistrationdata();

	public String deletUserregistration(Long id);
}
