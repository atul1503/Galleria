package com.example.galleria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.galleria.model.User;
import com.example.galleria.service.UserService;

@RestController
public class Controller {
	
@Autowired
UserService service;

@PostMapping("/user")
public void setUser(@RequestBody User user) {
	service.saveOrUpdate(user);
}


@GetMapping("/user")
public User getUser(@RequestParam String username) {
	return service.getUserByID(username);
}

