package com.java.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.demo.modal.UserDetails;
import com.java.demo.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	
	public UserService (UserRepository userRepository)
	{
		this.userRepository=userRepository;
	}

    public UserDetails saveUser(UserDetails user) {
        return userRepository.save(user);
    }
}
