package com.jsp.airindia.service;

import com.jsp.airindia.dto.UserDto;
import com.jsp.airindia.entity.User;

public interface UserSerice {

	int userRegistration(UserDto dto);
	
	User userLogin(String username, String password);
}
