package com.examplep.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.examplep.model.Customer;

public interface CustomerRepository  extends JpaRepository<Customer,Long>{

	
}
