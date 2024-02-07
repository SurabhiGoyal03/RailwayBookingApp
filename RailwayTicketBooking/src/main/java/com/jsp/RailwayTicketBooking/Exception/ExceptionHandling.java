package com.jsp.RailwayTicketBooking.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.HttpClientErrorException.NotAcceptable;

import com.jsp.RailwayTicketBooking.util.ResponseStructure;

@RestControllerAdvice
public class ExceptionHandling {
	
	@ExceptionHandler(AgentNotCreatedException.class)
	public ResponseEntity<ResponseStructure<String>> agentNotCreatedException(AgentNotCreatedException e){
		
		ResponseStructure<String> structure =new ResponseStructure<String>();
		structure.setStatusCode(HttpStatus.NOT_ACCEPTABLE.value());
		structure.setMessage("object is not created");
		structure.setData(e.getMessage());		
		
		return new ResponseEntity<ResponseStructure<String>>(structure,HttpStatus.NOT_ACCEPTABLE);
	}
	
	
	

}
