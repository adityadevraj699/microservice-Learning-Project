package com.lcwd.hotel.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lcwd.hotel.entities.Hotel;
import com.lcwd.hotel.exception.ResourceNotFoundException;
import com.lcwd.hotel.repository.HotelRepository;
import com.lcwd.hotel.service.HotelService;

@Service
public class HotelServiceImpl implements HotelService {
	private HotelRepository hotelRepo;
	
	public HotelServiceImpl(HotelRepository hotelRepo) {
		this.hotelRepo = hotelRepo;
	}

	@Override
	public Hotel create(Hotel hotel) {
		// TODO Auto-generated method stub
		return hotelRepo.save(hotel);
	}

	@Override
	public List<Hotel> getAllHotel() {
		// TODO Auto-generated method stub
		return hotelRepo.findAll();
	}

	@Override
	public Hotel getSingleHotelById(String Id) {
		// TODO Auto-generated method stub
		return hotelRepo.findById(Id).orElseThrow(()->new ResourceNotFoundException("Hotel", "id", Id));
	}



	@Override
	public void deleteHotelById(String hotelId) {

	    Hotel existingHotel = hotelRepo.findById(hotelId)
	            .orElseThrow(() -> new ResourceNotFoundException("Hotel not found with id " + hotelId));

	    hotelRepo.delete(existingHotel);
	}

	@Override
	public Hotel updateHotel(String hotelId, Hotel hotel) {

	    Hotel existingHotel = hotelRepo.findById(hotelId)
	            .orElseThrow(() -> new ResourceNotFoundException("Hotel not found with id " + hotelId));

	    existingHotel.setName(hotel.getName());
	    existingHotel.setLocation(hotel.getLocation());
	    existingHotel.setAbout(hotel.getAbout());
	    existingHotel.setAddress(hotel.getAddress());
	    existingHotel.setCity(hotel.getCity());
	    existingHotel.setContactNumber(hotel.getContactNumber());

	    return hotelRepo.save(existingHotel);
	}

}
