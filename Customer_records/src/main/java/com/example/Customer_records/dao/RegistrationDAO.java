package com.example.Customer_records.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Customer_records.entity.Registration_Entity;

public interface RegistrationDAO extends JpaRepository<Registration_Entity, Integer>{

}
