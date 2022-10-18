package com.projetoinicial.userdept.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projetoinicial.userdept.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
}
