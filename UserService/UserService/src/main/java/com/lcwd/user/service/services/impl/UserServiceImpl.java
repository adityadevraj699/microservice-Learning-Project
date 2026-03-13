package com.lcwd.user.service.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.lcwd.user.service.entities.Users;
import com.lcwd.user.service.exceptions.ResourceNotFoundException;
import com.lcwd.user.service.repository.UserRepository;
import com.lcwd.user.service.services.UserServices;

@Service
public class UserServiceImpl implements UserServices{
	
	    private final UserRepository userRepo;

	    public UserServiceImpl(UserRepository userRepo) {
	        this.userRepo = userRepo;
	    }

	@Override
	public Users createUser(Users user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public List<Users> getAllUsers() {
		// TODO Auto-generated method stub
		return userRepo.findAll();
	}

	@Override
	public Users getUserById(String userId) {
		// TODO Auto-generated method stub
		return userRepo.findById(userId).orElseThrow(()->new ResourceNotFoundException("User", "id", userId));
	}

	@Override
	public Users updateUser(String userId, Users user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(String userId) {
		// TODO Auto-generated method stub
		
	}

}
