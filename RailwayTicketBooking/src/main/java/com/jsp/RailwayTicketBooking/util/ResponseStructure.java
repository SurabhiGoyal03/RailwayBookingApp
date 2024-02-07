package com.jsp.RailwayTicketBooking.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResponseStructure<T> {
	
	int statusCode;
	String message;
	T data;
	
	

}
