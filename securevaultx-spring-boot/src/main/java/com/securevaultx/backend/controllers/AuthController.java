package com.securevaultx.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.securevaultx.backend.request.LoginRequest;
import com.securevaultx.backend.request.RegisterRequest;
import com.securevaultx.backend.response.ApiResponse;
import com.securevaultx.backend.response.LoginResponse;
import com.securevaultx.backend.services.AuthService;

@RestController
public class AuthController {
	
	@Autowired
	private AuthService authService;
	
	@PostMapping("/api/auth/register")
	public ResponseEntity<ApiResponse<Void>> register(@RequestBody RegisterRequest request) {
		System.out.println("Register API called");

	    boolean status = authService.registerUser(request);

	    if (status) {
	        return ResponseEntity.status(HttpStatus.CREATED).body(new ApiResponse<>(true, "User registered successfully", null));
	    } else {
	        return ResponseEntity.badRequest().body(new ApiResponse<>(false, "Registration failed"));
	    }
	}
	
	@PostMapping("/api/auth/login")
	public ResponseEntity<ApiResponse<LoginResponse>> login(@RequestBody LoginRequest request) {
		System.out.println("Login API called");
		
		LoginResponse loginResponse = authService.loginUser(request);
		
		if (loginResponse != null) {
	        return ResponseEntity.status(HttpStatus.OK).body(new ApiResponse<>(true, "Login successfully", loginResponse));
	    } else {
	        return ResponseEntity.badRequest().body(new ApiResponse<>(false, "Registration failed"));
	    }
	}

	
}
