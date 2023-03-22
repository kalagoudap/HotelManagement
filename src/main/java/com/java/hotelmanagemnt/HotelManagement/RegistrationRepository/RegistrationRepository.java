package com.java.hotelmanagemnt.HotelManagement.RegistrationRepository;


import com.java.hotelmanagemnt.HotelManagement.User_Registration.UserRegistration;
import org.springframework.data.couchbase.repository.CouchbaseRepository;

public interface RegistrationRepository extends CouchbaseRepository<UserRegistration, Long> {

}
