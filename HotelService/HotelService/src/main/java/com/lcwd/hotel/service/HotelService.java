package com.lcwd.hotel.service;

import java.util.List;

import com.lcwd.hotel.entities.Hotel;

public interface HotelService {

	
	//create
	Hotel create(Hotel hotel);
	
	//getAll
	List<Hotel> getAllHotel();
	
	
	//single Get
	Hotel getSingleHotelById(String Id);
	
	//update Hotel
	Hotel updateHotel(String hotelId,Hotel hotel);
	
	//Delete hotel
	void deleteHotelById(String Id);
	
}
