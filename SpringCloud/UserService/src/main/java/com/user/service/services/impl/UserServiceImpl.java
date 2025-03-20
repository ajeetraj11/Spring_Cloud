package com.user.service.services.impl;

import com.user.service.entities.User;
import com.user.service.exception.ResourceNotFountException;
import com.user.service.repositories.UserRepository;
import com.user.service.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

     @Autowired
     private UserRepository userRepository;

     @Override
     public User saveUser(User user) {
          String randomUserId = UUID.randomUUID().toString();
          user.setUserId(randomUserId);
          return userRepository.save(user);
     }

     @Override
     public List<User> getAllUser() {
          return userRepository.findAll();
     }

     @Override
     public User getUser(String userId) {
          return userRepository.findById(userId).orElseThrow(()-> new ResourceNotFountException("User with given id is not found on server !!" + userId));
     }
}
