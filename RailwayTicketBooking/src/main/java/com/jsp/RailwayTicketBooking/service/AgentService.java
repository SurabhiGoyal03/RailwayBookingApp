package com.jsp.RailwayTicketBooking.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.jsp.RailwayTicketBooking.Exception.AgentNotCreatedException;
import com.jsp.RailwayTicketBooking.dao.AgentRepository;
import com.jsp.RailwayTicketBooking.entity.Agent;
import com.jsp.RailwayTicketBooking.util.ResponseStructure;

@Service
public class AgentService {
	
	@Autowired
	AgentRepository agentRepository;
	
	public ResponseEntity<ResponseStructure<Agent>> saveAgent(Agent agent){
		
		Agent save = agentRepository.save(agent);
		
		if(save != null) {
			ResponseStructure<Agent> responseStructure = new ResponseStructure<Agent> ();
			responseStructure.setStatusCode(HttpStatus.CREATED.value());
			responseStructure.setMessage("Data is stored in database");
			responseStructure.setData(save);
			return new ResponseEntity<ResponseStructure<Agent>>(responseStructure, HttpStatus.CREATED);
	}
		throw new AgentNotCreatedException();
	}
	
	
	

}
