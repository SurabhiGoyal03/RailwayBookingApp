package com.jsp.RailwayTicketBooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.RailwayTicketBooking.entity.Passenger;

@Repository
public interface PassengerRepositroy extends JpaRepository<Passenger, Integer> {
	
	
	

}
