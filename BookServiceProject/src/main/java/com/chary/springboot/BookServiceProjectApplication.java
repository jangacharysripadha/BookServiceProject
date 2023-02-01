package com.chary.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import com.chary.springboot.entities.Book;

@SpringBootApplication
@EnableDiscoveryClient
public class BookServiceProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookServiceProjectApplication.class, args);
		System.out.println("welcome to Book Service Project");
		
	}

}
