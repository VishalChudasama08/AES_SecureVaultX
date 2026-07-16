package com.securevaultx.backend.services;

import com.securevaultx.backend.dto.RegisterRequest;

public interface AuthService {

	public boolean registerUser(RegisterRequest registerRequest);
	
}
