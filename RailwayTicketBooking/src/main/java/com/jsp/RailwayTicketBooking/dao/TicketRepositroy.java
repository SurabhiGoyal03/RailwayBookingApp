package com.jsp.RailwayTicketBooking.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.RailwayTicketBooking.entity.Ticket;

@Repository
public interface TicketRepositroy extends JpaRepository<Ticket, Integer> {

}
