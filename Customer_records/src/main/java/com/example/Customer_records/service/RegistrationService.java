package com.example.Customer_records.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.Customer_records.dao.RegistrationDAO;
import com.example.Customer_records.entity.Registration_Entity;
@Service
@Component
public class RegistrationService {
@Autowired
private RegistrationDAO registationdao;
public String SignUp(Registration_Entity registrationEntity) {
	try {
		registationdao.save(registrationEntity);
		return "Registration Successful!!";
	}catch(Exception e) {
		e.printStackTrace();
		return "Registration error";
	}
}

}
