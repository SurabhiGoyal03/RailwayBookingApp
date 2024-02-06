package com.jsp.RailwayTicketBooking;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jsp.RailwayTicketBooking.entity.Agent;

@SpringBootApplication
public class RailwayTicketBookingApplication {

	public static void main(String[] args) {
		SpringApplication.run(RailwayTicketBookingApplication.class, args);
		
		Agent agent = new Agent();
		
		
	}

}
