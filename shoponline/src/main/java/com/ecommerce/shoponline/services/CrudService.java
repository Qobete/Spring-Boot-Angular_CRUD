 package com.ecommerce.shoponline.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.ecommerce.shoponline.model.Product;
import com.ecommerce.shoponline.repository.CrudRepo;

@Service
public class CrudService {
	
	@Autowired
	private CrudRepo repo;
	
	public List<Product> fetchProductList(){
		return repo.findAll();
	}
	
	 public Product saveProductToDB(Product product) {
		 
		 return repo.save(product);
	 }
	 
	 public Optional<Product> fetchProductById(Long id) {
		 
		 return repo.findById(id);
	 }
	 
	 	 public String deleteProductById(Long id) {
		 
	 		 String result;
	 		 try 
	 		 {
	 			 repo.deleteById(id);
	 			 result = "Product successfully deleted!!!";
	 		 }
	 		 catch (Exception e) 
	 		 {
	 			result = "Selected product id already not available!!!";
	 		 }
	 		 return result;
	 		
	 }
}
