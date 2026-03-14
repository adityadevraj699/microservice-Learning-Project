package com.lcwd.hotel.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lcwd.hotel.entities.Hotel;

public interface HotelRepository extends JpaRepository<Hotel, String> {
	
	//create hotel
	//get All Hotels
	//get Single Hotel By Id
	//Update Hotel
	//Delete Hotel

}
