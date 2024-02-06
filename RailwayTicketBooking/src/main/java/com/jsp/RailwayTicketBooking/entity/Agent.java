package com.jsp.RailwayTicketBooking.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.Valid;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Entity
@Getter
@Setter
@NoArgsConstructor
@Valid
public class Agent {  // user database keyword
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@NotNull
	private String name ;
	
	@Column(nullable=false)
	private String password;
	@Column(nullable=false)
	private String email;
	@Column(nullable=false)
	@Max(10)
	private int phone;

	
}
