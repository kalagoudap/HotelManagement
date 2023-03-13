package com.java.hotelmanagemnt.HotelManagement.RegistrationRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.hotelmanagemnt.HotelManagement.User_Registration.UserRegistration;

public interface RegistrationRepository extends JpaRepository<UserRegistration, Long> {

}
