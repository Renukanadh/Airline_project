package com.jsp.airindia.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Entity
@Table(name = "checkin_table")
public class Checkin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int checkinId;
	private String seatNumber;
	private String gateNumber;
}
