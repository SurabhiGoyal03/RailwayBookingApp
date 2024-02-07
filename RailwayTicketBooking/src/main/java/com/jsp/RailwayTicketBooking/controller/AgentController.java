package com.jsp.RailwayTicketBooking.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.RailwayTicketBooking.entity.Agent;
import com.jsp.RailwayTicketBooking.service.AgentService;
import com.jsp.RailwayTicketBooking.util.ResponseStructure;

@RestController
@RequestMapping("/railway")
public class AgentController {
	
	@Autowired
	AgentService agentService;
	
	@PostMapping("/agent")
	public ResponseEntity<ResponseStructure<Agent>> saveAgent(@RequestBody Agent agent){
		
		return  agentService.saveAgent(agent) ;
		
	}
	

}
