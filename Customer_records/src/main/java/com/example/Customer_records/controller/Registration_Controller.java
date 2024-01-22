package com.example.Customer_records.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Customer_records.entity.Registration_Entity;
import com.example.Customer_records.service.RegistrationService;

@RestController
//@RequestMapping()
public class Registration_Controller {
	@Autowired
	private RegistrationService registration;
	@PostMapping("/Signup")
public String Registration(@RequestBody Registration_Entity registration_entity) {
		return registration.SignUp(registration_entity);
	}
}
