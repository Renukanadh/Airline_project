package com.jsp.airindia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookInfoServiceImp implements BookInfoService{

	@Autowired
	private BookInfoService service;
}
