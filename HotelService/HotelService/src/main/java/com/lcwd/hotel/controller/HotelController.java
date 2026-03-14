package com.lcwd.hotel.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.hotel.entities.Hotel;
import com.lcwd.hotel.service.HotelService;

@RestController
@RequestMapping("/hotels")
public class HotelController {
	private HotelService hotelService;
	public HotelController(HotelService hotelService) {
		this.hotelService = hotelService;
	}
	//create hotel
	@PostMapping
	public ResponseEntity<Hotel> createHotel(@RequestBody Hotel hotel){
		Hotel createHotel = hotelService.create(hotel);
		return ResponseEntity.status(HttpStatus.CREATED).body(createHotel);
	}
	
	//get All Hotels
	@GetMapping
	public ResponseEntity<List<Hotel>> getAllHotel(){
		List<Hotel> hotels = hotelService.getAllHotel();
		return ResponseEntity.ok(hotels);
	}
	//Get Single Hotels
	@GetMapping("/{hotelId}")
	public ResponseEntity<Hotel> getHotelByID(@PathVariable String hotelId){
		Hotel hotel = hotelService.getSingleHotelById(hotelId);
		return ResponseEntity.ok(hotel);
	}
	//Update Hotel
	@PutMapping("/{hotelId}")
	public ResponseEntity<Hotel> updateHotel(
	        @PathVariable String hotelId,
	        @RequestBody Hotel hotel){

	    Hotel updatedHotel = hotelService.updateHotel(hotelId, hotel);

	    return ResponseEntity.ok(updatedHotel);
	}
	
	//Delete Hotel
	@DeleteMapping("/{hotelId}")
	public ResponseEntity<Void> deleteHotel(@PathVariable String hotelId){

	    hotelService.deleteHotelById(hotelId);

	    return ResponseEntity.noContent().build();
	}

}
