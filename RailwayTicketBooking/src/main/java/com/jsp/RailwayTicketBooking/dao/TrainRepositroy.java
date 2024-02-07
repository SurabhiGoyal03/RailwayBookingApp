package com.jsp.RailwayTicketBooking.dao;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jsp.RailwayTicketBooking.entity.Train;

@Repository
public interface TrainRepositroy extends JpaRepository<Train, Integer> {

}
