package com.usecoupon.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usecoupon.entity.UserDetails;

public interface UserRepo extends JpaRepository<UserDetails, Long> {

}
