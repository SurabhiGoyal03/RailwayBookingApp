package com.jsp.RailwayTicketBooking.entity;

import org.springframework.stereotype.Component;

import com.jsp.RailwayTicketBooking.util.Gender;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
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
public class Passenger {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator  ="myseqPass")
	@SequenceGenerator(name = "myseqPass",initialValue = 100,allocationSize = 50)
	private int id ;
	@NotNull
	private String name;
	@Column(nullable = false)
	private int age;
	@Column(nullable = false)
	private Gender gender;
	@Max(10)
	private int phone;
		

}
