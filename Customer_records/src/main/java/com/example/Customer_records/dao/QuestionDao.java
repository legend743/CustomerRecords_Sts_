package com.example.Customer_records.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Customer_records.entity.Question;

public interface QuestionDao extends JpaRepository<Question, Integer>{

}
