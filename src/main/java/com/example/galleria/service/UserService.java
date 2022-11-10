package com.example.galleria.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.galleria.model.User;
import com.example.galleria.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository repo;
	
	public User getUserByID(String username) {
		return repo.findById(username).get();
	}
	
	public void saveOrUpdate(User user) {
		repo.save(user);
	}

}
