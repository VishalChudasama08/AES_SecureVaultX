package com.securevaultx.backend.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.securevaultx.backend.dto.RegisterRequest;
import com.securevaultx.backend.services.AuthService;

@RestController
public class AuthController {
	
	@Autowired
	private AuthService authService;
	
	@PostMapping("/api/auth/register")
	public ResponseEntity<?> register(@RequestBody RegisterRequest request) {
		System.out.println("Register API called");

	    boolean status = authService.registerUser(request);

	    if (status) {
	        return ResponseEntity.ok("User registered successfully");
	    } else {
	        return ResponseEntity.badRequest().body("Registration failed");
	    }
	}

}
