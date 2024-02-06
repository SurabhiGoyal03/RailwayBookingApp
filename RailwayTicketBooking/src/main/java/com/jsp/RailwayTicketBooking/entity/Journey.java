package com.jsp.RailwayTicketBooking.entity;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.SequenceGenerator;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Component
@Entity
@Getter
@Setter
@NoArgsConstructor
public class Journey {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE , generator = "myseqJur")
	@SequenceGenerator(name="myseqJur",initialValue = 1000 , allocationSize = 25)
	private int id;
	@Column(nullable = false)
	private String startFrom;
	@Column(nullable = false)
	private String destination;
	@Column(nullable = false)
	private LocalDate date;
	@Column(nullable = false)
	private double price;
	
	@ManyToMany
	List<Train> trains;

}
