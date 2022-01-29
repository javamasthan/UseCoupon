package com.usecoupon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usecoupon.entity.UserDetails;
import com.usecoupon.repository.UserRepo;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDetails saveUser(UserDetails user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

}
