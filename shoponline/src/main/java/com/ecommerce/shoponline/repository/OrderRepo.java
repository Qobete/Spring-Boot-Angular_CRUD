package com.ecommerce.shoponline.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.shoponline.model.Order;

public interface OrderRepo extends JpaRepository<Order, Long> {

}
