package com.securevaultx.backend.services;

import com.securevaultx.backend.request.LoginRequest;
import com.securevaultx.backend.request.RegisterRequest;
import com.securevaultx.backend.response.LoginResponse;

public interface AuthService {

	public boolean registerUser(RegisterRequest registerRequest);
	public LoginResponse loginUser(LoginRequest loginRequest);
	
}
