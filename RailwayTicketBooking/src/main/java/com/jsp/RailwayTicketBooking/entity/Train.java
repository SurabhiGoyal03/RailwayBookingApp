package com.jsp.RailwayTicketBooking.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
@Component
public class Train {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "myseq")
	@SequenceGenerator(name="myseq",initialValue = 200 , allocationSize = 50)
	private int id ;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String classes;
	
	
	@ManyToMany
	List<Journey> journeys;
	
}
