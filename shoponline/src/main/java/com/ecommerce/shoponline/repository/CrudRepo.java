package com.ecommerce.shoponline.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.shoponline.model.Product;

@Repository
public interface CrudRepo extends JpaRepository<Product, Long> {

}
