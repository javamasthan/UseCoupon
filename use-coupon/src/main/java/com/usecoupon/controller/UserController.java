package com.usecoupon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usecoupon.entity.UserDetails;
import com.usecoupon.service.UserService;

@RestController
@RequestMapping(value="/user")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	
	@PostMapping(value="/saveUser")
	public UserDetails saveUser(@RequestBody() UserDetails user){
		return userService.saveUser(user);
		
	}
	

}
