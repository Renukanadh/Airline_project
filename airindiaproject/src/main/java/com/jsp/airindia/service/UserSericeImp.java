package com.jsp.airindia.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.airindia.dto.UserDto;
import com.jsp.airindia.entity.User;
import com.jsp.airindia.repository.UserRepository;

@Service
public class UserSericeImp implements UserSerice{

	@Autowired
	private UserRepository repository;

	@Override
	public int userRegistration(UserDto dto) {
		User user = repository.save(User.builder()
				.firstName(dto.getFirstName())
				.lastName(dto.getLastName())
				.gender(dto.getGender())
				.mobileNumber(dto.getMobileNumber())
				.username(dto.getUsername())
				.password(dto.getPassword())
				.build());
		return user.getUserId();
	}

	@Override
	public User userLogin(String username, String password) {
		User u1 = repository.findByUsernameAndPassword(username, password);
		UserDto dto = UserDto.builder().build();
		return null;
	}
}
