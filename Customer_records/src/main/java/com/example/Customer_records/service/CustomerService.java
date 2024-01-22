package com.example.Customer_records.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.Customer_records.dao.CustomerDAO;
import com.example.Customer_records.entity.Customer;

@Service

public class CustomerService {
	@Autowired
	private CustomerDAO dao;
	public String addCustomer(Customer customer) {
		try {
		dao.save(customer);
		return "customer details have been saved successfully";
		}catch(Exception e){
			e.printStackTrace();
			return "error in saving data";
		}
		

		// write dao method to automate the read and write 
		
	}
	public Optional<Customer> getCustomerById(Integer id) {
        return dao.findById(id);
    }
	public List<Customer> getAllCustomers() {
        return dao.findAll();
    }
}
