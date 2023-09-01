package com.jsp.airindia.dto;

import java.time.LocalTime;

import com.jsp.airindia.entity.Fare;
import com.jsp.airindia.entity.Flight;
import com.jsp.airindia.entity.FlightInfo;
import com.jsp.airindia.entity.Inventory;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
public class PassengerDto {

	private String emailId;
	private String firstName;
	private String lastName;
	private String gender;
	private String mobileNumber;
}
