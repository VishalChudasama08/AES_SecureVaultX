package com.securevaultx.backend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.securevaultx.backend.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
