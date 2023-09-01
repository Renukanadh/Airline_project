package com.jsp.airindia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.airindia.dto.UserDto;
import com.jsp.airindia.service.UserSerice;

@RestController
@RequestMapping
public class UserController {

	@Autowired
	private UserSerice serice;
	
	public ResponseEntity<String> addUser(@RequestBody UserDto dto){
		return ResponseEntity.status(HttpStatus.FOUND).body(null);
	}
}
