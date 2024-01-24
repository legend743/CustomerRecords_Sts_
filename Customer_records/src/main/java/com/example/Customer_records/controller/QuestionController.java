package com.example.Customer_records.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.Customer_records.entity.Question;
import com.example.Customer_records.service.QuestionService;

@RestController
public class QuestionController {
	@Autowired
	private QuestionService questionService;
	@PostMapping("/Question")
	public ResponseEntity<Question> AddQuestion(@RequestBody Question question) {
		Question createdquestion=questionService.createQuestion(question);
		
		return new ResponseEntity<>(createdquestion,HttpStatus.CREATED);
		
	}

}
