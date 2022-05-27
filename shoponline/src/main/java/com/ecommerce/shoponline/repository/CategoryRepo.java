package com.ecommerce.shoponline.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.shoponline.model.Category;

public interface CategoryRepo extends JpaRepository<Category, Long> {

}
