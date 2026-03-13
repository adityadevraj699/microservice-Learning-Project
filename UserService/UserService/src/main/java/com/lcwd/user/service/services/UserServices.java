package com.lcwd.user.service.services;

import java.util.List;

import com.lcwd.user.service.entities.Users;

public interface UserServices {
	
	 // create user
    Users createUser(Users user);

    // get all users
    List<Users> getAllUsers();

    // get single user
    Users getUserById(String userId);

    // update user
    Users updateUser(String userId, Users user);

    // delete user
    void deleteUser(String userId);

}
