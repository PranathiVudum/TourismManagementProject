package com.examplep;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.examplep.Repository.CustomerRepository;

@SpringBootApplication
public class TourismManagementProjectApplication implements CommandLineRunner{

	

	TourismManagementProjectApplication(CustomerRepository customerRepository) {
    }

	public static void main(String[] args) {
		SpringApplication.run(TourismManagementProjectApplication.class, args);
	}
 @Override
	public void run(String... args) throws Exception {
		
		
	}

}
