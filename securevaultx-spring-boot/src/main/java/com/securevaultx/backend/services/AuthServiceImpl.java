package com.securevaultx.backend.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.securevaultx.backend.dto.RegisterRequest;
import com.securevaultx.backend.entities.User;
import com.securevaultx.backend.repositories.UserRepository;

@Service
public class AuthServiceImpl implements AuthService {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public boolean registerUser(RegisterRequest registerRequest) {
		try {
			User user = new User();

			user.setFullName(registerRequest.getFullName());
			user.setPhoneNumber(registerRequest.getPhoneNumber());
			user.setEmail(registerRequest.getEmail());
			user.setPassword(registerRequest.getPassword());
			
			userRepository.save(user);
			return true;
		} catch (Exception e) {
			return false;
		}
	}


}
