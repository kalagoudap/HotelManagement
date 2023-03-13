package com.java.hotelmanagemnt.HotelManagement.RegistrationCustomException;

import com.java.hotelmanagemnt.HotelManagement.RegistartionEnum.ValidationResponseMessage;

public class CustomExceptionforRegistartion extends RuntimeException{
	
	private String ErrorReason;
	
	private String message;
	
	private String sample;
	
	public CustomExceptionforRegistartion(String errorreason, String message, String sample){
		this.ErrorReason = errorreason;
		this.message = message;
		this.sample = sample;
	}
	
}
