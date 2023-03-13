package com.java.hotelmanagemnt.HotelManagement.iRgestrationController;

import java.util.List;
import java.util.Objects;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.java.hotelmanagemnt.HotelManagement.Registrationdto.Registrationdto;
import com.java.hotelmanagemnt.HotelManagement.User_Registration.UserRegistration;

@RequestMapping("/registration")
@RestController
public interface iRegistrationController {
	
	@GetMapping("/user/get/{id}")
	public ResponseEntity<UserRegistration> getUserRegisetred(@PathVariable Long id);
	
	@PostMapping("/user/save")
	public ResponseEntity<UserRegistration> saveUserRegister(@RequestBody Registrationdto dto);
	
	@PutMapping("/user/update")
	public ResponseEntity<UserRegistration> updateUserRegistration(@RequestBody Registrationdto registrationdto);
	
	@DeleteMapping("/user/delete")
	public String deleteUserRegistration(@PathVariable Long id);
	
	@GetMapping("/Users/getall")
	public List<UserRegistration> getAllUserRegistration();

}
