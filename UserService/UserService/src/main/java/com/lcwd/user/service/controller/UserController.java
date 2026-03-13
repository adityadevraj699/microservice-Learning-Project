package com.lcwd.user.service.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lcwd.user.service.entities.Users;
import com.lcwd.user.service.services.UserServices;

@RestController
@RequestMapping("/users")
public class UserController {
	
	private UserServices userServices;
	public UserController(UserServices userServices) {
		this.userServices = userServices;
	}
	
	//create
	@PostMapping
	public ResponseEntity<Users> createUser(@RequestBody Users user){
		Users createuser = userServices.createUser(user);
		return ResponseEntity.status(HttpStatus.CREATED).body(createuser);
		
	}
	//single users
	@GetMapping("/{userId}")
	public ResponseEntity<Users> getSingleUser(@PathVariable String userId){
		Users user = userServices.getUserById(userId);
		return ResponseEntity.ok(user);
	}
	//all users
	@GetMapping
	public ResponseEntity<List<Users>> getAllUser(){
		List<Users> users = userServices.getAllUsers();
		return ResponseEntity.ok(users);
	}
	//update user
	//delete user

}
