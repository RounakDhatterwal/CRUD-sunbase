package com.sunbase.crud.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sunbase.crud.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {
	
	  User findByEmail(String email);

}
