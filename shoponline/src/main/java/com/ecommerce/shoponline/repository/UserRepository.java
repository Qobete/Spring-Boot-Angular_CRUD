package com.ecommerce.shoponline.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.shoponline.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	Optional<User> findByMobile(String mobile);
	
}
