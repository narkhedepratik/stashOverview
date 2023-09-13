package com.bitlogic.main.controller;


import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.bitlogic.main.model.User;

@RestController
public class UserController {

	@PostMapping("/crateUser")
	public User createUser(@RequestBody User user)
	{
		//iwill  write remainig code latter.
		return user;
	}
	
	@GetMapping("/expose_users")
	public String viewUsers()
	{
		return "I will give userdata latter";

	}

}
