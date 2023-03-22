package com.java.hotelmanagemnt.HotelManagement.User_Registration;


import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.index.CompositeQueryIndex;
import org.springframework.data.couchbase.core.index.QueryIndexed;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.Field;


@Document
@CompositeQueryIndex(fields = {"id","firstname"})
public class UserRegistration {

	@Id
	@QueryIndexed
	private Long id;
	
	@Field
	@QueryIndexed
	private String firstname;
	@Field
	private String lastname;
	
	@Field
	private String email;
	
	@Field
	private Long phonenumber;
	
	@Field
	private Long adharnumber;
	
	@Field
	private int age;
	
	@Field
	private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
	
	
}
