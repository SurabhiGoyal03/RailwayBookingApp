package com.jsp.RailwayTicketBooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.RailwayTicketBooking.entity.Agent;


@Repository
public interface AgentRepository extends JpaRepository<Agent,Integer>{
	

}


