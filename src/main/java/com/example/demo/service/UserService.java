package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.UserDetails;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
    
	private UserRepository userRepository;
	public UserService (UserRepository userRepository)
	{
		this.userRepository=userRepository;
	}

    public UserDetails saveUser(UserDetails user) {
        return userRepository.save(user);
    }
}
