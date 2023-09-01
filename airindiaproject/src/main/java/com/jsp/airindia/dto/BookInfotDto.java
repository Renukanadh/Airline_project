package com.jsp.airindia.dto;

import java.time.LocalDate;
import java.time.LocalTime;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
public class BookInfotDto {

	private LocalDate bookingDate;
	private String destination;
	private double fareCost;
	private LocalDate flightDate;
	private String flightNumber;
	private String status;
	private LocalTime flightTime;
	private String currentCity;
}
