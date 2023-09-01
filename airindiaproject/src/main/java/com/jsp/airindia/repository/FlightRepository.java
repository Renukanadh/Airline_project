package com.jsp.airindia.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.airindia.entity.Flight;

public interface FlightRepository extends JpaRepository<Flight, Integer>{

}
