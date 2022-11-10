package com.example.galleria.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.galleria.model.User; 

public interface UserRepository extends CrudRepository<User,String> {
	
}
