package com.java.hotelmanagemnt.HotelManagement.RegistartionServices;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;

import com.java.hotelmanagemnt.HotelManagement.RegistrationRepository.RegistrationRepository;
import com.java.hotelmanagemnt.HotelManagement.Registrationdto.Registrationdto;
import com.java.hotelmanagemnt.HotelManagement.User_Registration.UserRegistration;
import com.java.hotelmanagemnt.HotelManagement.iRegistrationServices.iRegistrationService;

public class UserRegistrationService implements iRegistrationService {

	@Autowired
	RegistrationRepository registrationRepository;
	
	@Override
	public ResponseEntity<UserRegistration> getUserRegistration(Long id) {
		return new ResponseEntity<UserRegistration>(registrationRepository.findById(id).get(), HttpStatus.FOUND);
	}

	@Override
	public List<UserRegistration> getAllUserRegistration() {
		return registrationRepository.findAll();
	}

	@Override
	public ResponseEntity<UserRegistration> saveUserRegistrationdata(Registrationdto dto) {
		UserRegistration userRegistration = new UserRegistration();
		
		userRegistration.setFirstname(dto.getFirstname());
		userRegistration.setLastname(dto.getLastname());
		userRegistration.setEmail(dto.getEmail());
		userRegistration.setAdharnumber(dto.getAdharnumber());
		userRegistration.setAge(dto.getAge());
		userRegistration.setPassword(dto.getPassword());
		userRegistration.setPhonenumber(dto.getPhonenumber());
		return new ResponseEntity<UserRegistration>(registrationRepository.save(userRegistration),HttpStatus.CREATED);
	}

	@Override
	public ResponseEntity<UserRegistration> updateUserRegistrationdata(Registrationdto dto) {
		UserRegistration userRegistration = new UserRegistration();
		if(!dto.getFirstname().isEmpty())
			userRegistration.setFirstname(dto.getFirstname());
		if(!dto.getLastname().isEmpty())
			userRegistration.setLastname(dto.getLastname());
		if(dto.getPhonenumber() != 0)
			userRegistration.setEmail(dto.getEmail());
		if(dto.getAdharnumber() != 0)
			userRegistration.setAdharnumber(dto.getAdharnumber());
		if(dto.getAge() != 0)
			userRegistration.setAge(dto.getAge());
		if(!dto.getPassword().isEmpty())
			userRegistration.setPassword(dto.getPassword());
		if(dto.getPhonenumber() != 0)
			userRegistration.setPhonenumber(dto.getPhonenumber());
		return new ResponseEntity<UserRegistration>(registrationRepository.save(userRegistration), HttpStatus.OK);
	}

	@Override
	public ResponseEntity<UserRegistration> patchUserRegistrationdata() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deletUserregistration(Long id) {
		registrationRepository.deleteById(id);

		return "Record Deleted";
	}

}
