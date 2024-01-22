package com.example.Customer_records.entity;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Registration_Entity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Cust_id;
	
 @Column(name="email")
private String email;
 @Column(name="password")
private String password;
 
 
 
 public Registration_Entity() {
	 
 }
public Registration_Entity(String email, String password) {
	super();
	this.email = email;
	this.password = hashPassword(password);
}

private String hashPassword(String plainPassword) {
    BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    return passwordEncoder.encode(plainPassword);
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}




}
