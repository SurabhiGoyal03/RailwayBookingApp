package com.jsp.RailwayTicketBooking.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.jsp.RailwayTicketBooking.dao.PassengerRepositroy;
import com.jsp.RailwayTicketBooking.entity.Passenger;

public class PassengerService {

	@Autowired
	private PassengerRepositroy passengerRepositroy;

	public Passenger save(Passenger passenger) {

		return passengerRepositroy.save(passenger);

	}

}
