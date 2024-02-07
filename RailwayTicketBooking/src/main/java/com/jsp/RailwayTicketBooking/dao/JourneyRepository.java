package com.jsp.RailwayTicketBooking.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.RailwayTicketBooking.entity.Journey;

@Repository
public interface JourneyRepository extends JpaRepository<Journey, Integer>{
	
//	@Autowired
//	private Train train;

}
