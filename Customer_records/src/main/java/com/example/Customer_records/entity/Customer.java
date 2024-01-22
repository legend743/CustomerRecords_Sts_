package com.example.Customer_records.entity;

import jakarta.annotation.Generated;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Customer {
	@Id 
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cust_id;
	@Column
	private String cust_name;
	@Column
	private String cust_address;
	
	public Customer() {
		
	}

	public Customer(int cust_id, String cust_name, String cust_address) {
		super();
		this.cust_id = cust_id;
		this.cust_name = cust_name;
		this.cust_address = cust_address;
		System.out.println(cust_name+"---------------------------");
		System.out.println(cust_address+"---------------------------");
		
	}

	public String getCust_name() {
		return cust_name;
	}

	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}

	public String getCust_address() {
		return cust_address;
	}

	public void setCust_address(String cust_address) {
		this.cust_address = cust_address;
	}
	
	
	}
