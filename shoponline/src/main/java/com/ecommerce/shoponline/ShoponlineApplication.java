package com.ecommerce.shoponline;


import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.boot.autoconfigure.domain.EntityScan;
//import org.springframework.boot.context.properties.EnableConfigurationProperties;
//import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.ecommerce.shoponline", "com.ecommerce.shoponline.controller"})
//@ComponentScan(basePackages = {"com.ecommerce.shoponline.controller.*"})
public class ShoponlineApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShoponlineApplication.class, args);
		System.out.println("Welcome to Geeks Shop");
	}
}