package com.user.service.services;

import com.user.service.entities.User;

import java.util.List;

public interface UserService {
     // User operations

     // Create
     User saveUser(User user);

     // Get all user
     List<User> getAllUser();

     // Get single user
     User getUser(String userId);

}
