package com.java.hotelmanagemnt.HotelManagement.Configration;

import com.java.hotelmanagemnt.HotelManagement.RegistartionServices.UserRegistrationService;
import com.java.hotelmanagemnt.HotelManagement.iRegistrationServices.iRegistrationService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.java.hotelmanagemnt.HotelManagement.Registrationdto.Registrationdto;
import com.java.hotelmanagemnt.HotelManagement.iRegistrationValidation.UserRegistrationValidation;
import org.springframework.data.couchbase.config.AbstractCouchbaseConfiguration;

@Configuration
public class RegistrationConfigration extends AbstractCouchbaseConfiguration {
	
	@Bean
	public Registrationdto getRegistrationdto() {
		return new Registrationdto();
	}
	
	@Bean
	public UserRegistrationValidation getRegistrationValidation() {
		return new UserRegistrationValidation();
	}

	@Bean
	public iRegistrationService getIRegistrationService(){
		return new UserRegistrationService();
	}

	@Override
	public String getConnectionString() {
		return "127.0.0.1";
	}

	@Override
	public String getUserName() {
		return "Administrator";
	}

	@Override
	public String getPassword() {
		return "Administrator";
	}

	@Override
	public String getBucketName() {
		return "Registration";
	}
}
