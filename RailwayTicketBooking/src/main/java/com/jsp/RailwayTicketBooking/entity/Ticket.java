package com.jsp.RailwayTicketBooking.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

@Component
@Entity

public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "mysequence")
	@SequenceGenerator(name="mysequence",initialValue = 700 , allocationSize = 20)
	private int id;
	
	@Column(nullable = false)
	private double tot_price;
	
	@OneToOne
	private Journey journey;
	
	@OneToMany
	List<Passenger> passengers;
	

}
