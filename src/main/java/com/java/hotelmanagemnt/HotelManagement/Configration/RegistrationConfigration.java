package com.java.hotelmanagemnt.HotelManagement.Configration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.hotelmanagemnt.HotelManagement.Registrationdto.Registrationdto;
import com.java.hotelmanagemnt.HotelManagement.iRegistrationValidation.UserRegistrationValidation;

@Configuration
public class RegistrationConfigration {
	
	@Bean
	public Registrationdto getRegistrationdto() {
		return new Registrationdto();
	}
	
	@Bean
	public UserRegistrationValidation getRegistrationValidation() {
		return new UserRegistrationValidation();
	}
}
