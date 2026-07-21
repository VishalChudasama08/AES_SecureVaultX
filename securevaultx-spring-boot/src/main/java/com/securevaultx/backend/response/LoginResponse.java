package com.securevaultx.backend.response;

import java.time.LocalDateTime;

public class LoginResponse {
	private String fullName;
	private String phoneNumber;
	private String email;
	private LocalDateTime updatedAt;
	private LocalDateTime createdAt;
	
	public LoginResponse() {}
	public LoginResponse(String fullName, String phoneNumber, String email, LocalDateTime updatedAt,
			LocalDateTime createdAt) {
		this.fullName = fullName;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.updatedAt = updatedAt;
		this.createdAt = createdAt;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	
}
