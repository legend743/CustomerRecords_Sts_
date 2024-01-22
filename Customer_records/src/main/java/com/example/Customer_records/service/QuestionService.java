package com.example.Customer_records.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.Customer_records.dao.QuestionDao;
import com.example.Customer_records.entity.Question;

public class QuestionService {
	@Autowired
	private QuestionDao questiondao;

	public  Question createQuestion(Question question) {
		
		return questiondao.save(question);
//		Question createquestion=new Question();
//		createquestion.setQuestion(question.getQuestion());
//		
	}
	

}
