package com.ecommerce.shoponline.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.shoponline.model.AddtoCart;

public interface AddToCart extends JpaRepository<AddtoCart,Long> {

}
