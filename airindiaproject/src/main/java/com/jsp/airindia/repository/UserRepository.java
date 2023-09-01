package com.jsp.airindia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jsp.airindia.entity.User;

public interface UserRepository extends JpaRepository<User, Integer>{

	@Query("Select user FROM User user WHERE user.username =:uName AND user.password =:password")
	User findByUsernameAndPassword(@Param("uName") String username, @Param("password") String password);
}
