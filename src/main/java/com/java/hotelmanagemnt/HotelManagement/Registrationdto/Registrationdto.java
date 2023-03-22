package com.java.hotelmanagemnt.HotelManagement.Registrationdto;

public class Registrationdto {

	private Long id;
	private String firstname;
	
	private String lastname;
	
	private String email;
	
	private Long phonenumber;
	
	private Long adharnumber;
	
	private int age;
	
	private String password;

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Long getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}

	public Long getAdharnumber() {
		return adharnumber;
	}

	public void setAdharnumber(Long adharnumber) {
		this.adharnumber = adharnumber;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
