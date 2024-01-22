package com.example.Customer_records.dao;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.Customer_records.entity.*;


public interface CustomerDAO extends JpaRepository<Customer, Integer> {

	
	
}
