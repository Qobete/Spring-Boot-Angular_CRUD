package com.ecommerce.shoponline.controller;

//import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import com.ecommerce.shoponline.repository.CrudRepo;
import com.ecommerce.shoponline.model.Product;
import com.ecommerce.shoponline.services.CrudService;

@RestController
//@RequestMapping("/product")
public class CrudRestController {
	
	
	@Autowired
	private CrudService service;
	
	
	//@RequestMapping(path = "/getproductlist", method = RequestMethod.GET)
	@GetMapping("/getproductlist")
	 @CrossOrigin(origins = "http://localhost:4200")
	 
	public List<Product> fetchProductList() {
		List<Product> products = new ArrayList<Product>();
		//fetch list of product from database
		products = service.fetchProductList();
		return products;
	}
	 
	 @PostMapping("/addproduct")
	 @CrossOrigin(origins = "http://localhost:4200")
	 public Product saveProduct(@RequestBody Product product ) {
		 
		 return service.saveProductToDB(product);
	 }
	 
//	 @PostMapping("/upload")
//	 @CrossOrigin(origins = "http://localhost:4200")
//	 public void uploadImage(@RequestParam("imageFile") MultipartFile file) throws IOException {
//	 this.bytes = file.getBytes();
	 //}
	 @GetMapping("/getproductbyid/{id}")
	 @CrossOrigin(origins = "http://localhost:4200")
	 public Product fetchproductById(@PathVariable Long id) {
		 
		 return service.fetchProductById(id).get();
	 }
	 
	 @DeleteMapping("/deleteproductbyid/{id}")
	 @CrossOrigin(origins = "http://localhost:4200")
	 public String deleteProductById(@PathVariable Long id) {
		 
		 return service.deleteProductById(id);
	 }
}
